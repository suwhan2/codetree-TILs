N = int(input())
arr = list(map(int,input().split()))
dp = [0 for _ in range(N)]
dp[1]=1
for i in range(N):
    for j in range(i):
        if arr[j]>arr[i]:
            dp[i] = max(dp[i], dp[j]+1)

print(max(dp))