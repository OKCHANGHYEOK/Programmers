def solution(phone_number):
    result = ""

    for i in range(0, len(phone_number)):
        if i <= len(phone_number) - 5:
            result += "*"
        else:
            result += phone_number[i]    

    return result