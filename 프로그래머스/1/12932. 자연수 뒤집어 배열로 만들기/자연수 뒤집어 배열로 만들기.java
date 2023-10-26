class Solution {
    public int[] solution(long n) {
        String ln = String.valueOf(n);
        int[] answer = new int[ln.length()];
        String ln_rev = "";
        
        for(int i = ln.length() - 1; i >= 0; i--) {
            ln_rev += ln.charAt(i);
        }
        for(int i = 0; i < answer.length; i++) {
            answer[i] = Integer.parseInt(ln_rev.substring(i, i+1));
        }
        
        return answer;
    }
}