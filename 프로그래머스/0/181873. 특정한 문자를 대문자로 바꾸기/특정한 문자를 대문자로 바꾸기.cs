using System;
using System.Collections.Generic;
using System.Linq;

public class Solution {
    public string solution(string my_string, string alp) {
        string answer = "";
        
        answer = my_string.Replace(alp, alp.ToUpper());
        
        return answer;
    }
}