def solution(n):
    f1, f2 = 0, 1

    for _ in range(0, n):
        next = f1 + f2

        f1 = f2 % 1234567
        f2 = next % 1234567

    return f2