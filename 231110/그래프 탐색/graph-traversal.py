N, M = tuple(map(int,input().split()))
graph=[[] for _ in range(N+1)]
visited=[False for _ in range(N+1)]

for _ in range(M):
    x,y = tuple(map(int,input().split()))
    graph[x].append(y)
    graph[y].append(x)
    
def dfs(vertex):
    global count
    for curr_V in graph[vertex]:
        if not visited[curr_V]:
            count+=1
            visited[curr_V]=True
            dfs(curr_V)
count=0
root_vertex =1
visited[root_vertex]=True
dfs(1)

print(count)