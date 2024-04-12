class Solution {
    public long solution(int n) {
        long answer = 0;
        
        long f1 = 1;
        long f2 = 2;
        
        if(n == 1) return f1;
        if(n == 2) return f2;
        
        long fn = 0;
        for(int i = 3; i <= n; i++) {
        	fn = (f1 + f2) % 1234567;
        	long tmp = f2;
        	f2 = fn;
        	f1 = tmp;
        }
        
        answer = fn;
        
        return answer;
    }
}