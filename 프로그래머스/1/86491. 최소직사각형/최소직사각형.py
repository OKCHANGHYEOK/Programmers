def solution(sizes):
    answer = 0

    arr = [sorted(x) for x in sizes]

    width = max([x[0] for x in arr]) 
    height = max([x[1] for x in arr])

    answer = width * height

    return answer