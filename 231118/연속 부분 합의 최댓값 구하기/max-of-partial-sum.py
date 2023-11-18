# DP
# dp정의 - 마지막 원소가 i 인 부분수열의 최대 합
# 점화식 - max(2*arr[i],dp[i-1]+arr[i])
# 초기조건 - dp[1] = 2*arr[1], INT_MIN으로 dp초기화
# 조건 - 없음
import sys

INT_MIN = -sys.maxsize
n = int(input())
arr = [0] + list(map(int, input().split()))
dp = [0 for _ in range(n + 1)]


def initialize():
    for i in range(n + 1):
        dp[i] = INT_MIN
    dp[1] = arr[1]


initialize()

for i in range(2, n + 1):
    dp[i] = max(dp[i - 1] + arr[i], arr[i])

print(max(dp))