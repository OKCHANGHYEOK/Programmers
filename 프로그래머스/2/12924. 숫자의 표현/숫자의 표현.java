class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i <= n; i++) {
        	if(i % 2 != 0 && n % i == 0) {
        		answer++;
        	}
        }
        
        
        
        return answer;
    }
}