n=int(input())
dp=[-1 for _ in range(20)]

dp[1] = 1
dp[2] = 2
for i in range(3,n+1):
    sum=0
    for j in range(1,i//2+1):
        sum+=dp[i-j]*2
    if i%2==1:
        sum+=dp[i//2]
    dp[i]=sum

print(dp[n])