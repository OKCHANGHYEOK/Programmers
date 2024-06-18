using System;

using System;
using System.Collections.Generic;

public class Solution
{
    public int solution(int x, int y, int n)
    {
        return bfs(x, y, n);  
    }

    private int bfs(int x, int y, int n)
    {

        // 현재값과 연산횟수를 저장할 큐
        Queue<(int curr, int cacl)> q = new Queue<(int curr, int cacl)>(); 

        // 방문 집합
        HashSet<(int value, int count)> visited = new HashSet<(int value, int count)>();

        q.Enqueue((x, 0));
        visited.Add((x, 0));

        while (q.Count > 0)
        {
            int size = q.Count;
            for (int i = 0; i < size; i++)
            {
                (int curr, int cacl) = q.Dequeue(); // 튜플 요소에 이름을 명시

                if(curr == y)
                {
                    return cacl;
                }

                if (curr + n <= y && !visited.Contains((curr + n, cacl + 1)))
                {
                    q.Enqueue((curr + n, cacl + 1));
                    visited.Add((curr + n, cacl + 1));
                }

                if(curr * 2 <= y && !visited.Contains((curr * 2, cacl + 1)))
                {
                    q.Enqueue((curr * 2, cacl + 1));
                    visited.Add((curr * 2, cacl + 1));
                }

                if(curr * 3 <= y && !visited.Contains((curr * 3, cacl + 1)))
                {
                    q.Enqueue((curr * 3, cacl + 1));
                    visited.Add((curr * 3, cacl + 1));
                } 
            }
        }

        return -1;
    }
}