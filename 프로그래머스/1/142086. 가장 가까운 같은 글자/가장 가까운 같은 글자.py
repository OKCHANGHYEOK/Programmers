def solution(s):
    answer = []

    arr = {}

    for i, word in enumerate(s):
        if not word in arr.keys():
            answer.append(-1)
        else:
            answer.append(i - arr[word])

        arr[word] = i                              

    return answer