import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        char[] tmp1 = before.toCharArray();
        char[] tmp2 = after.toCharArray();
        
        Arrays.sort(tmp1);
        Arrays.sort(tmp2);
        
        String s1 = new String(tmp1);
        String s2 = new String(tmp2);
        
        if(s1.equals(s2)) answer = 1;
        
        return answer;
    }
}