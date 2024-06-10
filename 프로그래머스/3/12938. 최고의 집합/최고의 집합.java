class Solution {
    public int[] solution(int n, int s) {
        int[] answer = {};
        
        int share = s / n;
        int rem = s % n;
        
        if(share == 0) {
            return new int[] {-1};
        }
        
        answer = new int[n];
        
        int index = 0;
        
        for(int i = 0; i < n - rem; i++) {
            answer[i] = share;
            index++;
        }
        
        for(int i = 0; i < rem; i++) {
            answer[index] = share + 1;
            index++;
        }
        
        return answer;
    }
}