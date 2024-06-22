class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int n = board.length; 
        int[] dh = {0, 1, -1, 0};
        int[] dw = {1, 0, 0, -1};
        
                for(int k = 0; k < 4; k++) {
                    int hc = h + dh[k];
                    int wc = w + dw[k];
                    if(hc >= 0 && hc < n && wc >= 0 && wc < n && board[h][w].equals(board[hc][wc])) answer++;
                }
    
        
        return answer;
    }
}