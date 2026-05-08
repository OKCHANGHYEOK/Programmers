def solution(n : int):
    answer = 0

    ternary = ''

    while True:
        if n <= 2:
            ternary += str(n)
            break

        ternary += str(n % 3)   

        n = (int)(n / 3)

    answer = int(ternary, 3)

    return answer