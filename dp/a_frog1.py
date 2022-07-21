# https://atcoder.jp/contests/dp/tasks/dp_a

import sys

N = int(sys.stdin.readline())
H_LIST = list(map(int, sys.stdin.readline().split()))

dp = [0] * N  # 足場iに辿り着くまでに支払うコストの総和の最小値

"""
dp[i] = 0 (i = 0)
dp[i] = |h_1 - h_0| (i = 1)
dp[i] = min(dp[i−2] + |h_i − h_i−2|, dp[i−1] + |h_i − h_i−1|) (i >= 2)
"""

dp[0] = 0
dp[1] = abs(H_LIST[1] - H_LIST[0])

for i in range(2, N):
  dp[i] = min(dp[i-2] + abs(H_LIST[i]-H_LIST[i-2]), dp[i-1] + abs(H_LIST[i]-H_LIST[i-1]))

print(dp[N - 1])
