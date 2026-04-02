def solution(s : str):
    arrUpper = []
    arrLower = []

    for word in s:
        arrUpper.append(word) if word.isupper() else arrLower.append(word)            

    list.sort(arrUpper, reverse=True)
    list.sort(arrLower, reverse=True)

    result = arrLower + arrUpper

    return ''.join(result)