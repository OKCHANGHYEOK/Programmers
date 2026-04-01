def solution(s):
    sIndex = int(len(s) / 2)

    if len(s) % 2 == 0:
        return s[sIndex-1:sIndex+1]
    else:
        return s[sIndex]