class Solution {
    public int solution(int order) {
        int answer = 0;
        
        String str = String.valueOf(order);
        
        for(int i = 0; i < str.length(); i++) {
            int num = Integer.valueOf(str.substring(i, i + 1));
            if(num != 0 && num % 3 == 0) answer++;
        }
        
        return answer;
    }
}