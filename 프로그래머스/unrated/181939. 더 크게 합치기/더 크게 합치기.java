class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String s1 = String.valueOf(a) + String.valueOf(b);
        String s2 = String.valueOf(b) + String.valueOf(a);
        
        answer = Integer.valueOf(s1);
        
        if(s2.compareTo(s1) > 0) {
            answer = Integer.valueOf(s2);
        }
        return answer;
    }
}