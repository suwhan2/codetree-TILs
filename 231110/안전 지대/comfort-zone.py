# 안전영역을 구하기 =dfs
# 1~100 반복 시간이 너무 오래걸림
# 존재하는 원소만 반복
# 우선 안정영역 구하기부터 구현

N, M = tuple(map(int, input().split()))
houses = [
    list(map(int, input().split()))
    for _ in range(N)
]

visited = [
    [0 for _ in range(M)]
    for _ in range(N)
]
k_list =[1]
for i in range(N):
    for j in range(M):
        if houses[i][j] not in k_list:
            k_list.append(houses[i][j])
k_list.sort()


def in_range(x, y):
    return 0 <= x and x < N and 0 <= y and y < M


def can_go(x, y, k):
    if not in_range(x, y):
        return False
    if houses[x][y] <= k or visited[x][y] == 1:
        return False
    return True


def dfs(x, y, k):
    dxs, dys = [1, 0, -1, 0], [0, 1, 0, -1]

    for dx, dy in zip(dxs, dys):
        nx, ny = x + dx, y + dy
        if can_go(nx, ny, k):
            visited[nx][ny] = 1
            dfs(nx, ny, k)


def calculate_safe_zone(k):
    count = 0
    for i in range(N):
        for j in range(M):
            if houses[i][j] > k and visited[i][j] != 1:
                count += 1
                visited[i][j] = 1
                dfs(i, j, k)

    for i in range(N):
        for j in range(M):
            visited[i][j] = 0

    return count


max_count = 0
max_k = k_list[0]
for k in k_list:
    count = calculate_safe_zone(k)
    if count > max_count:
        max_count = count
        max_k = k

print(max_k, end=" ")
print(max_count)