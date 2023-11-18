# dp
# dp정의 - i일까지 입은 옷의 만족도 합
# 점화식 - max(dp[i-1][k]+abs(clothes[i-1][k]-clothes[i][j]),dp[i][j])
# 초기조건 - dp[1][k] = 0
# 조건
import sys
INT_MIN =-sys.maxsize
N, M = tuple(map(int,input().split()))
arr=[
    [0 for _ in range(N)]
    for _ in range(M+1)
]

for i in range(N):
    s,e,v = tuple(map(int,input().split()))

    for j in range(s,e+1):
        arr[j][i]=v

dp=[
    [0 for _ in range(N)]
    for _ in range(M+1)
]

def initialize():
    for i in range(2,M+1):
        for j in range(N):
            dp[i][j] = INT_MIN
initialize()
for i in range(2,M+1):
    for j in range(N):
        if arr[i][j]==0:
            continue
        for k in range(N):
            if arr[i-1][k]==0:
                continue
            dp[i][j] = max(dp[i][j],dp[i-1][k]+abs(arr[i-1][k]-arr[i][j]))

ans=0
for i in range(M+1):
    for j in range(N):
        ans=max(ans,dp[i][j])
print(ans)