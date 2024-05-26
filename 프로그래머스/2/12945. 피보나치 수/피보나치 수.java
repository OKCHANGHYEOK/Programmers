class Solution {
    private int[] memo;
    public int solution(int N) {
        int answer = 0;

        memo = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            memo[i] = -1;
        }
        return fibonacci(N);
    }

    private int fibonacci(int n) {
        if (memo[n] != -1) {
            return memo[n];
        }
        if (n == 0) {
            memo[n] = 0;
            return 0;
        }
        if (n == 1) {
            memo[n] = 1;
            return 1;
        }
        return memo[n] = (fibonacci(n - 1) + fibonacci(n - 2)) % 1234567;
    }
}
