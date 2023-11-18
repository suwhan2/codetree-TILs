import sys

N,M = tuple(map(int,input().split()))
coins=[0]+list(map(int,input().split()))
dp=[0 for _ in range(M+1)]

def initialize():
    for i in range(1,M+1):
        dp[i] = sys.maxsize
initialize()
for i in range(1,M+1):
    for j in range(1,N+1):
        if i>=coins[j]:
            if dp[i - coins[j]] == sys.maxsize:
                continue

            dp[i] = min(dp[i],dp[i-coins[j]]+1)

if dp[M]==sys.maxsize:
    print(-1)
else:
    print(dp[M])