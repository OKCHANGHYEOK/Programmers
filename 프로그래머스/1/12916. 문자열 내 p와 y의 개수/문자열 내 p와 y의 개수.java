class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        int p_count = 0;
        int y_count = 0;
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == 'p' || ch == 'P') p_count++;
            if(ch == 'y' || ch == 'Y') y_count++;
        }
        if(p_count == y_count) answer = true;
        else answer = false;
        
        return answer;
    }
}