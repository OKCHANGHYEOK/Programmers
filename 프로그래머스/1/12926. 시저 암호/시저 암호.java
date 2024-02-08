class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if((s.substring(i, i + 1)).equals(" ")) {
                answer += " ";
                continue;
            }
            if(ch + n > 'z' || (ch >= 'A' && ch <= 'Z' && ch + n > 'Z')) {
                ch -= 26;
            }
            ch += n;
            answer += String.valueOf(ch);
        }
        
        return answer;
    }
}