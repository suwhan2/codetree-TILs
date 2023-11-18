n = int(input())
arr = list(map(int,input().split()))
dp=[0 for _ in range(n)]

for i in range(1,n):
    for j in range(i):
        if (j+arr[j])>=i:
            dp[i] = max(dp[i],dp[j]+1)



ans=0
for i in range(1,n):
    if dp[i]==0:
        break
    if ans<dp[i]:
        ans = dp[i]
print(ans)