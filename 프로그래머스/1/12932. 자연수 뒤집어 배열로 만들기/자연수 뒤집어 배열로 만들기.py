def solution(n):
    answer = []

    arrNum = str(n)

    for i in range(len(arrNum) - 1, -1, -1):
        answer.append(int(arrNum[i]))

    return answer