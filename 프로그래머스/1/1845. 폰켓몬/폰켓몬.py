def solution(nums):
    selectable_cnt = len(nums) // 2
    pocket_cnt = len(set(nums))

    if selectable_cnt <= pocket_cnt:
        return selectable_cnt
    else:
        return pocket_cnt