class Solution {
    public long solution(long n) {
        long answer = 0;
        
        long isqr = (long) Math.sqrt(n);
        boolean hasSquare = isqr * isqr == n ? true : false;
        
        if(hasSquare) {
            answer = (isqr + 1) * (isqr + 1);
        }
        else {
            answer = -1;
        }
        
        return answer;
    }
}