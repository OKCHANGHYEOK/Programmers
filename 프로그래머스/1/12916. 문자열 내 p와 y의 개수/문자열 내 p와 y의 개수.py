def solution(s):    
    loweredStr = s.lower()

    arrStr = list(loweredStr)

    pCount = arrStr.count("p")
    yCount = arrStr.count("y")

    return True if pCount == yCount else False