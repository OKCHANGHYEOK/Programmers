import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[][] maps) {
        int answer = -1;

        Queue<int[]> q = new LinkedList<>();
        int n = maps.length;
        int m = maps[0].length;
        boolean[][] visited = new boolean[n][m];

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        q.add(new int[]{0, 0, 1});
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int row = cur[0];
            int col = cur[1];
            int dir = cur[2];

            if(row == maps.length - 1 && col == maps[0].length - 1) {
                answer = answer == -1 ? dir : Math.min(answer, dir);
                return answer;
            }

            for(int i = 0; i < dx.length; i++) {
                int nRow = row + dx[i];
                int nCol = col + dy[i];
                if(nRow >= 0 && nRow < n && nCol >= 0 && nCol < m && !visited[nRow][nCol] && maps[nRow][nCol] == 1) {
                    visited[nRow][nCol] = true;
                    q.add(new int[]{nRow, nCol, dir + 1});
                }
            }
        }

        return answer;
    }
}