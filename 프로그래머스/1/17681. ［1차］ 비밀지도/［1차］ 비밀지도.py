def solution(n, arr1, arr2):
    answer = []

    trans = str.maketrans({'1' : '#', '0' : ' '})

    for i in range(0, n):
        curr = arr1[i] | arr2[i]
        binary = bin(curr)[2:].rjust(n, '0')
        answer.append(binary.translate(trans))

    return answer