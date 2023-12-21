class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        int denom = denom1 * denom2;
        int numer = numer1 * denom2 + numer2 * denom1;

        for(int i = 1000; i >= 2; i--) {
            if(denom % i == 0 && numer % i == 0) {
                denom /= i;
                numer /= i;
            }
        }
        
        answer[0] = numer;
        answer[1] = denom;
        
      
        
        
        return answer;
    }
}