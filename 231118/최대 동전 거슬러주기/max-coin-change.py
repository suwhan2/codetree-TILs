# 중복이 가능
# dp 정의 하기 - 합이 i가 될 수 있는 최대 동전 수
# 초기 조건 -sys.maxsize로 dp 초기화
# 초기 조건 dp[0] = 0
# 점화식 dp[i] = max(dp[i], dp[i-coins[j]]+1
# 조건식 i >= coins[j]
import sys

# 입력부
N, M = tuple(map(int, input().split()))
coins = list(map(int, input().split()))
dp = [0 for _ in range(M+1)]

min_num = -sys.maxsize

def initialize():
    for i in range(M+1):
        dp[i] = min_num
    dp[0]=0

initialize()

for i in range(1,M+1):
    for j in range(N):
        if i>=coins[j]:
            dp[i] = max(dp[i], dp[i-coins[j]]+1)

if dp[M]==min_num:
    print(-1)
else:
    print(dp[M])