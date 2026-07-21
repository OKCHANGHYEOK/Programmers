from collections import deque

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

def solution(maps):
    n = len(maps) - 1
    m = len(maps[0]) - 1

    visited = [[False] * (m + 1) for _ in range(n + 1)] 
    ror = deque()
    ror.append((0, 0, 1))

    while ror:
        x, y, step = ror.popleft()

        if x == n and y == m:
            return step

        for k in range(4):
            nx = x + dx[k]
            ny = y + dy[k]

            if nx < 0 or ny < 0 or nx > n or ny > m:
                continue

            if maps[nx][ny] == 0:
                continue

            if not visited[nx][ny]:
                visited[nx][ny] = True
                ror.append((nx, ny, step + 1))  

    return -1   