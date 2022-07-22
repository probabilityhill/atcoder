# https://atcoder.jp/contests/abc237/tasks/abc237_c

import sys

s = sys.stdin.readline().rstrip()
s_removed_r = s.rstrip("a")
s_removed = s_removed_r.lstrip("a")
 
if s_removed == s_removed[::-1] and len(s_removed_r) - len(s_removed) <= len(s) - len(s_removed_r):
  print("Yes")
else:
  print("No")
