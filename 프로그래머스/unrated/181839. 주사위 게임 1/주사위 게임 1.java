class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        boolean aIsOdd = a % 2 != 0 ? true : false;
        boolean bIsOdd = b % 2 != 0 ? true : false;
        
        if(aIsOdd && bIsOdd) answer = (int)Math.pow(a, 2) + (int)Math.pow(b, 2);
        else if(aIsOdd || bIsOdd) answer = 2 * (a + b);
        else answer = Math.abs(a - b);
        
        return answer;
    }
}