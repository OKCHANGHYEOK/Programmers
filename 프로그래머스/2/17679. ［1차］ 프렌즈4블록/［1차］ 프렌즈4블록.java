import java.util.*;

class Solution {
    public int solution(int m, int n, String[] board) {
        int answer = 0;

        String[][] board2 = new String[m][n];


        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                board2[i][j] = board[i].charAt(j) + "";
            }
        }

        // 현재 제거 가능한 블록들을 저장할 셋
        Set<int[]> blocks = new HashSet<>();

        // 게임판 스캔
        while(true) {
            blocks.clear();
            // 게임판 스캔 시작
            for(int i = 0; i < m; i++) {
                for(int j = 0; j < n; j++) {
                    if(i + 1 < m && j + 1 < n && isDeletable(board2, i , j)) {
                        blocks.add(new int[]{i, j});
                        blocks.add(new int[]{i + 1, j});
                        blocks.add(new int[]{i, j + 1});
                        blocks.add(new int[]{i + 1, j + 1});
                    }
                }
            }

            // 게임판을 스캔해도 제거할 블록이 하나도 없다면
            if(blocks.isEmpty()) {
                break; // 스캔 종료
            }
            // 제거할 블록이 하나라도 있으면
            else {
                // 제거 가능한 블록을 모두 제거
                for(int[] block : blocks) {
                    board2[block[0]][block[1]] = "0";
                }
                // 빈자리를 채우기 위해 요소들을 위에서 아래로 떨어뜨린다
                for(int j = 0; j < n; j++) {
                    int empty = m - 1;
                    for(int i = m - 1; i >= 0; i--) {
                        if(!board2[i][j].equals("0")) {
                            String tmp = board2[i][j];
                            board2[i][j] = "0";
                            board2[empty][j] = tmp;
                            empty--;
                        }
                    }
                }
            }
        }

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(board2[i][j].equals("0")) {
                    answer++;
                }
            }
        }



        return answer;
    }

    // 해당 요소를 기준으로 2x2 블록이 성립하는지 확인하는 함수
    private boolean isDeletable(String[][] board, int i, int j) {
        String block = board[i][j];
        return !block.equals("0")
                && board[i][j + 1].equals(block)
                && board[i + 1][j].equals(block)
                && board[i + 1][j + 1].equals(block);
    }
}
