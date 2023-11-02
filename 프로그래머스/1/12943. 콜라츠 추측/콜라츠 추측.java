class Solution {
    public int solution(int num) {
        int answer = 0;
        long ln = Long.valueOf(num);
        
        if(ln == 1) return 0;
        
        while(ln != 1) {
            if(ln % 2 == 0) {
                ln /= 2;
                answer++;
            }
            else {
                ln *= 3;
                ln++;
                answer++;
            }
            if(answer == 500) return -1;
        }
        
        return answer;
    }
}