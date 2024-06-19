class Solution {
    private long[] memo;
    public long solution(int n) {
        memo = new long[n + 1];
        return fibonnaci(n);
    }
    
    private long fibonnaci(int n) {
        if(n == 0) return 1;
        if(n == 1) return 1;
        if(memo[n] != 0) return memo[n];
        
        memo[n] = (fibonnaci(n - 1) + fibonnaci(n - 2)) % 1000000007;
        
        return memo[n];
     }
}