N = int(input())
arr = list(map(int,input().split()))

dp=[-1 for _ in range(N)]
dp[0]=1

for i in range(1,N):
    for j in range(0,i):
        if arr[j]<arr[i]:
            dp[i] = max(dp[j]+1,dp[i])



print(max(dp))