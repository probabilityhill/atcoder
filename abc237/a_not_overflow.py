# https://atcoder.jp/contests/abc237/tasks/abc237_a

import sys

N = int(sys.stdin.readline())
print("Yes" if -2**31 <= N < 2**31 else "No")
