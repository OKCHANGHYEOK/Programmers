class Solution {
    public String solution(int age) {
        String answer = "";
        
        String str = String.valueOf(age);

        
        for(int i = 0; i < str.length(); i++) {
            char tmp = str.charAt(i);
            int num = 0;
            for(char ch = 'a'; ch <= 'z'; ch++) {
                if(num == Integer.valueOf(tmp - 48)) {
                    answer += String.valueOf(ch);
                    break;
                }
                num++;
            }
        }
        
        return answer;
    }
}