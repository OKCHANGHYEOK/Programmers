import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        int index = 0;
        for(int i = 0; i < s.length(); i++) {
            String str = s.substring(i, i + 1);
            if(str.equals(" ")) {
                answer += " ";
                index = 0;
                continue;
            }
            else {
                if(index % 2 == 0) {
                    answer += str.toUpperCase();
                }
                else {
                    answer += str.toLowerCase();
                }
                index++;
            }
        }
    
        
        return answer;
    }
}