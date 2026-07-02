def solution(arr1, arr2):
    row = len(arr1)
    col = len(arr2[0])
    num = len(arr1[0])

    arr = [[0] * col for _ in range(0, row)]

    for i in range(0, row):
        for j in range(0, col):
            for k in range(0, num):
               arr[i][j] += arr1[i][k] * arr2[k][j]
    
    return arr