N = int(input())
arr = [0]+list(map(int, input().split()))

dp = [0 for _ in range(N+1)]
dp[0] = 0

for i in range(1, N+1):
    for j in range(i):
        if arr[j] < arr[i]:
            dp[i] = max(dp[j] + 1, dp[i])

ans = 0
for i in range(N):
    ans = max(ans, dp[i])

print(ans)