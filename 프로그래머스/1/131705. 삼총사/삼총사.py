import itertools

def solution(number):    
    arrComb = list(itertools.combinations(number, 3))

    return len([x for x in arrComb if sum(x) == 0])