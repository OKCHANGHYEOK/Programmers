def solution(k, dungeons):
    arr_cnt = [0]

    visited = [False] * len(dungeons)

    explore(arr_cnt, k, dungeons, visited, 0)

    return arr_cnt[0]

def explore(arr_cnt, k, dungeons, visited, count):
    arr_cnt[0] = max(arr_cnt[0], count)

    for i in range(0, len(dungeons)):
        if not visited[i] and k >= dungeons[i][0]:
            visited[i] = True
            explore(arr_cnt, k - dungeons[i][1], dungeons, visited, count + 1)
            visited[i] = False