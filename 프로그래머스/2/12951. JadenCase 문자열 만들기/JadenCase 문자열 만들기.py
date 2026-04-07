def solution(s : str):
    answer = ''

    isFirstWordNumeric = False
    isJadenCase = False

    for char in list(s):
        if char == " ":
            answer += " "

            if isFirstWordNumeric: isFirstWordNumeric = False
            if isJadenCase : isJadenCase = False
            
            continue

        if char.isdigit():
            answer += char
            isFirstWordNumeric = True
        else:
            if isFirstWordNumeric or isJadenCase:
                answer += char.lower()

            else:
                answer += char.upper()
                isJadenCase = True

    return answer