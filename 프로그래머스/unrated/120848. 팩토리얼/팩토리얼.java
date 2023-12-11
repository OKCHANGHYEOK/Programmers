class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int fact = 1;
        for(int i = 1; i <= 10; i++) {
            fact *= i;
            answer++;
            if(fact >= n) break;
        }
        
        if(fact > n) answer--;
        
        return answer;
    }
}