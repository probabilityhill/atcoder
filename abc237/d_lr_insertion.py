# https://atcoder.jp/contests/abc237/tasks/abc237_d

import sys
from collections import deque

N = int(sys.stdin.readline())
S = sys.stdin.readline().rstrip()
d = deque([N])

for i in reversed(range(N)):
  if S[i] == "L":
    d.append(i)
  else:
    d.appendleft(i)
    
print(*d)
