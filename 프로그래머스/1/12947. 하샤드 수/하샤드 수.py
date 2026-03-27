def solution(x):
    arrNum = map(int, list(str(x)))

    return True if x % sum(arrNum) == 0 else False