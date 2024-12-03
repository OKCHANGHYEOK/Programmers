using System;
using System.Collections.Generic;

public class Solution {
     public static Boolean IsPrimeNumber(int num)
 {
     bool result = true;

     for (int i = 2; i <= Math.Sqrt(num); i++)
     {
         if (num % i == 0)
         {
             result = false;
             break;
         }
     }

     return result;
 }
     public static void bfs(string numbers, string current, bool[] visited, List<string> list)
 {
     if (!string.IsNullOrEmpty(current) && !current.Equals("1"))
     {
         list.Add(current);
     }

     for (int i = 0; i < numbers.Length; i++)
     {
         if (!visited[i])
         {
             visited[i] = true;

             bfs(numbers, current + numbers[i], visited, list);

             visited[i] = false;
         }
     }

 }
    
    public int solution(string numbers) {
        int answer = 0;
        
                    List<string> list = new List<string>();

            bfs(numbers, "", new bool[numbers.Length], list);

            list.RemoveAll(x => x.StartsWith("0"));
            
            HashSet<string> set = new HashSet<string>(list);

            foreach(string str in set)
            {
                if (IsPrimeNumber(Int32.Parse(str)))
                {
                    answer++;
                }
            }

        
        return answer;
    }
}