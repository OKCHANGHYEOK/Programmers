import java.util.Arrays;

class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        
        int size = board.length;
        
        // 모든 원소가 0인 n * n 배열
        int[][] anjun = new int[size + 2][size + 2];
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                anjun[i + 1][j + 1] = board[i][j];
            }
        }
        
        
        
        for(int i = 0; i < anjun.length; i++) {
            for(int j = 0; j < anjun.length; j++) {
                if(anjun[i][j] == 1) { // 지뢰가 존재하면
                    if(anjun[i - 1][j - 1] != 1) anjun[i - 1][j - 1] = 2;
                    if(anjun[i - 1][j] != 1) anjun[i - 1][j] = 2;
                    if(anjun[i - 1][j + 1] != 1) anjun[i - 1][j + 1] = 2;
                    if(anjun[i][j - 1] != 1) anjun[i][j - 1] = 2;
//                  if(anjun[i][j] != 1) anjun[i][j] = 2;
                    if(anjun[i][j + 1] != 1) anjun[i][j + 1] = 2;
                    if(anjun[i + 1][j - 1] != 1) anjun[i + 1][j - 1] = 2;
                    if(anjun[i + 1][j] != 1) anjun[i + 1][j] = 2;
                    if(anjun[i + 1][j + 1] != 1) anjun[i + 1][j + 1] = 2;
                }
            }
        }
        

        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                board[i][j] = anjun[i + 1][j + 1];
            }
        }
        
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                if(board[i][j] == 0) answer++;
            }
        }
        
        return answer;
    }
}