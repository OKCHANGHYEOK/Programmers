def solution(phone_book):
    sorted_phone_book : list[str] = sorted(phone_book)

    size = len(phone_book) - 1

    for i in range(0, size):
        if sorted_phone_book[i + 1].startswith(sorted_phone_book[i]):
            return False

    return True