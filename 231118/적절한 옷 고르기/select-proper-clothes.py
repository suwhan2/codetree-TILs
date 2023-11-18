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
출력:

5
예제2
입력:

3 5
1 3 39
1 4 20
4 5 25
출력:

62
제한
시간 제한: 1000ms
메모리 제한: 80MB
저작권자 © 브랜치앤바운드

코드트리 사이트의 모든 교육자료는 저작권법의 보호를 받습니다.
작성자의 동의 없는 무단 전재/복사/배포 등을 금지합니다.

블로그에 공유하는 방법 알아보기
Intermediate Low / DP II / 연속적이지만 직전 상황에 영향을 받는 DP


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