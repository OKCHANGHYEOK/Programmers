class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        for(int i = 0; i < s.length(); i++) {
            if(i == 0) answer[0] = -1;
            else {
                char ch = s.charAt(i);
                for(int j = i - 1; j > -1; j--) {
                    char tmp = s.charAt(j);
                    if(tmp == ch) {
                        answer[i] = i - j;
                        break;
                    }
                    else answer[i] = -1;
                }
            }
        }
        
        return answer;
    }
}