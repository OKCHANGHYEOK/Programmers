class Solution {
    public String solution(String myString) {
        String answer = "";
        
        for(int i = 0; i < myString.length(); i++) {
            char ch = myString.charAt(i);
            if('A' <= ch && ch <= 'Z') {
                ch += 32;
            }
            String tmp = String.valueOf(ch);
            answer += tmp;
        }
        
        return answer;
    }
}