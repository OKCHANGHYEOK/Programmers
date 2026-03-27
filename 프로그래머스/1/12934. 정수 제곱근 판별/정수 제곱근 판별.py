import math

def solution(n):
    sNum = math.sqrt(n)

    if sNum % 1 == 0:
        num = int(sNum) + 1
        
        return num ** 2
    
    else:
        return -1