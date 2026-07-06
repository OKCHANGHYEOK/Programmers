def solution(progresses, speeds):
    answer = []


    while True:
        release_cnt = 0

        for i in range(0, len(progresses)):
            progresses[i] += speeds[i]

        while progresses and progresses[0] >= 100:
            progresses.pop(0)
            speeds.pop(0)
            release_cnt += 1

        if release_cnt > 0:
            answer.append(release_cnt)

        if not progresses:
            break     

    return answer