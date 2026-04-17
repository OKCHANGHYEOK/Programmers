def solution(A, B):
    answer = 0

    list.sort(A)
    list.sort(B, reverse=True)

    for i in range(0, len(A)):
        answer += A[i] * B[i]

    return answer