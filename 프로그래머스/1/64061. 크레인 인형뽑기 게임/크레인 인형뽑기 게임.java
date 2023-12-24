import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        
        ArrayList<Integer> basket = new ArrayList<>(); // 바구니
        
        for(int i = 0; i < moves.length; i++) {
           if(basket.size() >= 2) {
        	   List<Integer> subList = basket.subList(basket.size() - 2, basket.size());
        	   if(subList.get(0) == subList.get(1)) {
        		   basket.subList(basket.size() - 2, basket.size()).clear();
        		   answer += 2;
        	   }
           }
           
           for(int j = 0; j < board[moves[i] - 1].length; j++) {
        	   if(board[j][moves[i] - 1] != 0) {
        		   basket.add(board[j][moves[i] - 1]);
        		   board[j][moves[i] - 1] = 0;
        		   break;
        	   }
           }
        }

        
        return answer;
    }
}
