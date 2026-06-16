def solution(arr):
    answer = 0

    for i in range(0, len(arr) - 1):
        if i == 0:
            answer = get_lcm(arr[i], arr[i+1])
        else:
            answer = get_lcm(answer, arr[i+1])    

    return answer

def get_lcm(n1, n2) -> int:
    def get_gcd(n1, n2) -> int:
        if n1 % n2 != 0:
            return get_gcd(n2, n1 % n2)
        else:
            return n2

    result = (int)((n1 * n2) / get_gcd(n1, n2))

    return result