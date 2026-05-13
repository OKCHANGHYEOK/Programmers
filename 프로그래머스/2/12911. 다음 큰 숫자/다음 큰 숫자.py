def solution(n):
    one_cnt = bin(n).count("1")
    next = n + 1

    while bin(next).count("1") != one_cnt:
        next += 1

    return next