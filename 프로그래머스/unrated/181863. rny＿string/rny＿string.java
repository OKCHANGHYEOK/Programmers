class Solution {
    public String solution(String rny_string) {
        String answer = "";
        
        for(int i = 0; i < rny_string.length(); i++) {
            char ch = rny_string.charAt(i);
            if(ch == 'm') {
                answer = rny_string.replace("m", "rn");
                break;
            }
            else answer = rny_string;
        }
        
        
        return answer;
    }
}