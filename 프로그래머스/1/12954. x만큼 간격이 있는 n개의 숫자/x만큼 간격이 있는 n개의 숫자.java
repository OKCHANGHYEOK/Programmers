class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        for(int i = 0; i < n; i++) {
            long tmp = (long)x * (i+1);
            answer[i] = tmp;
        }
        return answer;
    }
}