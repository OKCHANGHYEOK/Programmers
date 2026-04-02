def checkIsEven(num) -> bool:
    primeCount = 1

    end = int(num / 2)

    for i in range(1, end + 1):
        if num % i == 0:
            primeCount += 1   

    return True if primeCount % 2 == 0 else False         

def solution(left, right):
    answer = 0

    for i in range(left, right + 1):
        if checkIsEven(i):
            answer += i
        else:
            answer -= i

    return answer