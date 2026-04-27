def solution(n, m):
    if n == m:
        return [n, m]

    answer = []

    minNum = min(n, m)
    maxNum = max(n, m)

    for i in range(maxNum, 0, -1):
        if minNum % i == 0 and maxNum % i == 0:
            answer.append(i)
            break      

    if maxNum % minNum == 0:
        answer.append(maxNum)
    else:
        tmpNum = maxNum * minNum / answer[0]

        answer.append(int(tmpNum))

    return answer