That was a pretty challenging challenge! RSA combined with elliptic curves, in the end a very good review of ECs and some new things learnt along the way.

In a few words, the script generated a RSA key pair, gave us (n,e,d), which was weird already, and I thought factoring would be easy, but not quite, then created an EC on which the point defined by Gx and Gy could be on by computing b such that `Gy^2 = Gx^3 + b mod n`, and then proceeded to encrypt Gx and Gy by addingthe point e times.

Our goal was to get the point G from the point C, and remembering our group theory, we know that if the group operation is applied to G e times, then applying it e^-1 times would get us G back. Yes, but the inverse of e in what Z/nZ? Can't be with the given n or it would be way to easy. If we write #EC the order the the elliptic curve group defined earlier, it's actually in Z/(#EC)Z that we have to find the inverse of e. Okay, so we just have to find the order or cardinality of the EC group, and that's it, right? Not quite. Trying it with sage tells us that the order of a EC group with a composite modulus, as is the case with n because `n = p*q` with p and q prime, cannot be computed, instead we can find it with `#EC_n = #EC_p * #EC_q`. And in the end we come back to the problem of factoring n, with e and d given. That took a bit more googling than I initially thought, as writing:
```
e*d = 1 mod phi(n)
e*d = 1 + k*phi(n)
k*phi(n) = e*d - 1
```

did not cut it. On a crypto textbook (the Handbook of Applied Cryptography, very famous, link here: http://cacr.uwaterloo.ca/hac/about/chap8.pdf) I stumbled upon a method to get the factorization of n given e and d, which built upon `k*phi(n) = e*d - 1` but  wasn't that obvious. Implementing it with sage actually did give a result pretty fast, as the method claimed, there was a 1/2 probability to find a such `a` which would lead us to a non trivial factor of n and I already knew the number of powers of 2 in the decomposition of k (k*phi(n) in the equations above) from factordb (but unfortunately it failed in giving us the full decomposition), so that was pretty easily done with sage, and once the factorization of n was known, all was needed was to go back up in our chain of reasoning, getting the order of the groups of EC mod p and q, multiplying them to get the order the EC mod n, inversing e mod that order, and applying that many times the group operation on C! Phew, finally done! All that remained to be done was `long_to_bytes(Gx)` and `long_to_bytes(Gy)`, and that was it, we had the two parts of the flag, which was:

```HarekazeCTF{dynamit3_with_a_las3r_b3am}```
