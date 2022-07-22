# https://atcoder.jp/contests/abc237/tasks/abc237_b

import sys

H, _ = map(int, sys.stdin.readline().split())
matrix = [list(map(int, sys.stdin.readline().split())) for _ in range(H)]

for row in zip(*matrix):
  print(*row)
