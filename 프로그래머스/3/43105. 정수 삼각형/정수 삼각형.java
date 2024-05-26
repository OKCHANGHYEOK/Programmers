class Solution {
    private int[][] memo;
    public int solution(int[][] triangle) {
        int n = triangle.length;
        memo = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                memo[i][j] = -1;
            }
        }
        return bfs(triangle, 0, 0);
    }

    private int bfs(int[][] triangle, int i, int j) {
        if(i > triangle.length - 1 || j > triangle[i].length - 1) {
            return 0;
        }

        if(memo[i][j] != -1) {
            return memo[i][j];
        }

        int left = bfs(triangle, i + 1, j);
        int right = bfs(triangle, i + 1, j + 1);

        memo[i][j] = triangle[i][j] + Math.max(left, right);
        return memo[i][j];
    }
}