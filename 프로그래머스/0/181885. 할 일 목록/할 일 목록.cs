using System;
using System.Linq;
using System.Collections.Generic;

public class Solution {
    public string[] solution(string[] todo_list, bool[] finished) {
        string[] answer = new string[] {};
        
        List<string> list = new List<string>();
        
        for (int i = 0; i < todo_list.Length; i++) {
            if(!finished[i]) {
                list.Add(todo_list[i]);
            }
        }
        
        answer = list.ToArray();
        
        return answer;
    }
}