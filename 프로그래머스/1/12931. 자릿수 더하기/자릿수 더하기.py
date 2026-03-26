def solution(n):
    answer = 0

    arrNum = str(n)
    numList = list(arrNum)

    for num in numList:
        answer += int(num)

    return answer