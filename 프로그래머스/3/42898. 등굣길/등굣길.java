class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int[][] memo  = new int[m][n];

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                memo[i][j] = -1;
            }
        }

        for (int[] puddle : puddles) {
            memo[puddle[0] - 1][puddle[1] - 1] = 0;
        }

        return dfs(0, 0, m, n, puddles, memo);
    }

    private int dfs(int x, int y, int m, int n, int[][] puddles, int[][] memo) {
        if(x > m - 1 || y > n - 1) {
            return 0;
        }

       if(memo[x][y] == 0) {
           return 0;
       }


        if(x == m - 1 && y == n - 1) {
            return 1;
        }

        if(memo[x][y] != -1) {
            return memo[x][y];
        }

        memo[x][y] =  (dfs(x, y + 1, m, n, puddles, memo) + dfs(x + 1, y, m, n, puddles, memo)) % 1_000_000_007;

        return memo[x][y];
    }
}