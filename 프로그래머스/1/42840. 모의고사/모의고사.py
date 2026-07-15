def solution(answers):
    first_method = [1, 2, 3, 4, 5]
    second_method = [2, 1, 2, 3, 2, 4, 2, 5]
    third_method = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]

    arr_cnt = [0, 0, 0]

    for i in range(0, len(answers)):
        curr_ans = answers[i]

        if first_method[i % len(first_method)] == curr_ans:
            arr_cnt[0] += 1

        if second_method[i % len(second_method)] == curr_ans:
            arr_cnt[1] += 1

        if third_method[i % len(third_method)] == curr_ans:
            arr_cnt[2] += 1        

    max_cnt = max(arr_cnt)      

    return [i + 1 for i in range(0, len(arr_cnt)) if arr_cnt[i] == max_cnt]