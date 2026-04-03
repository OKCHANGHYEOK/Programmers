def solution(s):
    isTargetLength = True if (len(s) == 4 or len(s) == 6) else False

    return True if isTargetLength and s.isdigit() else False