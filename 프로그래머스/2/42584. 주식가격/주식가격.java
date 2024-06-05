class Solution {
    public int[] solution(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n];
        
        for(int i = 0; i < prices.length; i++) {
            for(int j = i + 1; j < prices.length; j++) {
                if(prices[j] >= prices[i]) {
                    answer[i]++;
                }
                else {
                    answer[i]++;
                    break;
                }
            }
        }
        
        
        return answer;
    }
}