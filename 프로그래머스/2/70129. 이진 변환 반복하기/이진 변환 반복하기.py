def solution(s : str):
    tryCnt = 0
    removedZeroCnt = 0
    currentStr = s

    while currentStr != "1":
        newStr = currentStr.replace("0", "")
        
        length = len(newStr)

        newStr = bin(length).replace("0b", "")

        tryCnt += 1
        removedZeroCnt += len(currentStr) - length

        currentStr = newStr

    return [tryCnt, removedZeroCnt]
