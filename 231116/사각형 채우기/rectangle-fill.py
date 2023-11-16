n=int(input())
memo=[-1 for _ in range(1001)]

def calculate_stair(n):
    if memo[n]!=-1:
        return memo[n]
    if n<=3:
        memo[n]=n
    else:
        memo[n] = calculate_stair(n-2) + calculate_stair(n-1)

    return memo[n]

print(calculate_stair(n)%10007)