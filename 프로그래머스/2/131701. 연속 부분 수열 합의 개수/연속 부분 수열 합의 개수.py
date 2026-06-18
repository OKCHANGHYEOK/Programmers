def solution(elements : list):
    extended = elements * 2

    size = len(elements)

    sums_set = set()

    for i in range(1, size + 1):
        sums_set.update({sum(extended[x:x+i]) for x in range(0, size)})

    return len(sums_set)