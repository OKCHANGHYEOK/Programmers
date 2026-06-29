def solution(s):
    answer = 0

    pairs = {
        "(" : ")",
        "{" : "}",
        "[" : "]"
    }

    for i in range(0, len(s)):
        rotated = list(s[i:] + s[:i])

        stack = []

        while rotated:
            current = rotated.pop(0)
            prev = stack[-1] if stack != [] else -1

            if prev in pairs.keys() and pairs[prev] == current:
                stack.pop()
            else:
                stack.append(current)    

        if stack == []:
            answer += 1        

    return answer