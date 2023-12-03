import java.util.ArrayList;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        
        ArrayList<Integer> rank = new ArrayList<>();
        
        for(int i = 0; i < score.length; i++) {
            if(i < k) {
                rank.add(score[i]);
                if(rank.size() >= 2) rank.sort((o1, o2) -> o1 - o2);
            }
            else {
                if(score[i] > rank.get(0)) {
                    rank.remove(0);
                    rank.add(score[i]);
                    rank.sort((o1, o2) -> o1 - o2);
                }
            }
            
            answer[i] = rank.get(0);
        }
        
        
        
        return answer;
    }
}