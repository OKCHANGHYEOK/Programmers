class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        int tmp = x;
        
        int sum = 0;
        while(x > 0){
            sum += x % 10;
            x /= 10;
        }
        
        
        if(tmp % sum == 0) answer = true;
        
        return answer;  
    }
}