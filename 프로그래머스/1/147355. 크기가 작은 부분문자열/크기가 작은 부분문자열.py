def solution(t, p):
    answer = 0

    windowSize = len(p)

    for i in range(0, len(t) - windowSize + 1):
        currentNum = int(t[i:windowSize + i])

        if currentNum <= int(p):
            answer += 1

    return answer