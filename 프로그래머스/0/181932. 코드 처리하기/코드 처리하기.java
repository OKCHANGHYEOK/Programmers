class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        
        for(int i = 0; i < code.length(); i++) {
            char ch = code.charAt(i);
            
            if(mode == 0) {
                if(ch == '1') {
                    mode = 1;
                }
                else {
                    if(i % 2 == 0) answer += code.substring(i, i+1);
                }
            }
            else {
                if(ch == '1') {
                    mode = 0;
                }
                else {
                    if(i % 2 != 0) answer += code.substring(i, i+1);
                }
            }
        }
        if("".equals(answer)) answer = "EMPTY";
        
        return answer;
    }
}