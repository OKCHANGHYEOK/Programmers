def solution(n):
    return sum(map(lambda x: x == '1', bin(n)))