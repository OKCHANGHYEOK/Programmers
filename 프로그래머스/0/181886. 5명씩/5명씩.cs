using System;
using System.Collections.Generic;
using System.Linq;

public class Solution {
    public string[] solution(string[] names) {
        string[] answer = new string[] {};
        
        List<string> list = new List<string>();
        
        for(int i = 0; i < names.Length; i += 5) {
            if (i > names.Length) break;
            list.Add(names[i]);
        }
        
        answer = list.ToArray();
        
        return answer;
    }
}