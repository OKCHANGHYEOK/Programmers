class Solution {
    public double solution(int balls, int share) {
        double bunja = 1;
        for(int i = balls; i > balls - share; i--) {
            bunja *= i;
        }
        double bunmo = 1;
        for(int i = share; i > 1; i--) {
            bunmo *= i;
        }
        
        double answer = bunja / bunmo;
        
        return answer;
    }
}