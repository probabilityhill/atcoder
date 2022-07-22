# https://atcoder.jp/contests/dp/tasks/dp_b

import sys

N, K = map(int, sys.stdin.readline().split())
H_LIST = list(map(int, sys.stdin.readline().split()))

dp = [0] * N  # 足場iに辿り着くまでに支払うコストの総和の最小値

"""
dp[i] = 0 (i = 0)
dp[i] = min(dp[i−j] + |h_i − h_i−j|) (1 <= i <= N-1 , 1 <= j <= min(i, K))
"""

dp[0] = 0

for i in range(1, N):
  mi = 10 ** 9
  for j in range(1, min(i+1, K+1)):
    mi = min(mi, dp[i-j] + abs(H_LIST[i] - H_LIST[i-j]))
  dp[i] = mi
  
print(dp[-1])
