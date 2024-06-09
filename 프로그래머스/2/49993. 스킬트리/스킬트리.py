def solution(skill, skill_trees):
    answer = 0

    for tree in skill_trees:
        curr = []
        cant = False
        for s in tree:
            if s in skill:
                curr.append(s)
                print(curr)
                if skill.index(s) != curr.index(s):
                    cant = True
                    break

        if not cant:
            answer += 1

    return answer