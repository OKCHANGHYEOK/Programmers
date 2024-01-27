class Solution {
    public int solution(int n) {
        int answer = n + 1;
        while(true) {
        	int count1 = Integer.bitCount(n);
        	int count2 = Integer.bitCount(answer);
        	
        	if(count1 == count2) return answer;
            
            answer++;
        }
    }
}