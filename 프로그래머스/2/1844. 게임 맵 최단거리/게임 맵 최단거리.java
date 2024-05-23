import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[][] maps) {
        int answer = -1;

        Queue<int[]> q = new LinkedList<>();
        int n = maps.length;
        int m = maps[0].length;
        boolean[][] visited = new boolean[n][m];
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

            if (row + 1 < n && col < m && !visited[row + 1][col] && maps[row + 1][col] == 1) {
                visited[row + 1][col] = true;
                q.add(new int[]{row + 1, col, dir + 1});
            }
            if(row < n && col + 1 < m && !visited[row][col + 1] && maps[row][col + 1] == 1) {
                visited[row][col + 1] = true;
                q.add(new int[]{row, col + 1, dir + 1});
            }
            if(row < n && col - 1 >= 0 && !visited[row][col - 1] && maps[row][col - 1] == 1) {
                visited[row][col - 1] = true;
                q.add(new int[]{row, col - 1, dir + 1});
            }
            if(row - 1 >= 0 && col < m && !visited[row- 1][col] && maps[row - 1][col] == 1) {
                visited[row - 1][col] = true;
                q.add(new int[]{row - 1, col, dir + 1});
            }
        }

        return answer;
    }
}