class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        
        for(int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            
            if(i % 2 == 0) {
                String tmp = "";
                
                for(int j = 0; j < str.length(); j++) {
                    char ch = str.charAt(j);
                    if('A' <= ch && ch <= 'Z') ch += 32;
                    tmp += String.valueOf(ch);
                }
                answer[i] = tmp;
            }
            else {
                String tmp = "";
                
                for(int j = 0; j < str.length(); j++) {
                    char ch = str.charAt(j);
                    if('a' <= ch && ch <= 'z') ch -= 32;
                    tmp += String.valueOf(ch);
                }
                answer[i] = tmp;
            }
        }
        return answer;
    }
}