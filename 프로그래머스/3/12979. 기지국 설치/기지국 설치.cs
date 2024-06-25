using System;
using System.Collections.Generic;

class Solution
{
    public int solution(int n, int[] stations, int w)
    {
        int answer = 0;

        int coverageRange = 2 * w + 1;

        List<(int, int)> covered = new List<(int, int)>();

        for (int i = 0; i < stations.Length; i++)
        {
            int station = stations[i] - 1;

            int start = station - w;
            int end = station + w;

            start = Math.Max(start, 0);
            end = Math.Min(end, n - 1);

            covered.Add((start, end));
        }

        int currentPosition = 0;

        foreach(var range in covered)
        {
            int start = range.Item1;
            int end = range.Item2;

            if(currentPosition < start)
            {
                int len = start - currentPosition;
                answer += (len + coverageRange - 1) / coverageRange;
            }

            currentPosition = end + 1;
        }

        if(currentPosition <= n)
        {
            int end = covered[covered.Count - 1].Item2;
            int len = n - end - 1;
            answer += (len + coverageRange - 1) / coverageRange;
        }

        return answer;
    }
}