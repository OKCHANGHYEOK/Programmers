def solution(s : str):
    answer = ''

    arrNum = list(map(int, s.split(" ")))

    minValue = min(arrNum)
    maxValue = max(arrNum)

    answer += str(minValue) + " " + str(maxValue)    

    return answer