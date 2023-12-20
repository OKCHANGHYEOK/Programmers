class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        
        for(int i = 0; i < score.length; i++) {
        	answer[i] = 1;
        }
        
        for(int i = 0; i < score.length; i++) {
        	double average1 = (score[i][0] + score[i][1]) / (double) 2;
        	for(int j = i + 1; j < score.length; j++) {
        		double average2 = (score[j][0] + score[j][1]) / (double) 2;
        		if(average1 > average2) answer[j]++;
        	}
        }
        
        for(int i = score.length - 1; i >= 0; i--) {
        	double average1 = (score[i][0] + score[i][1]) / (double) 2;
        	for(int j = i - 1; j >= 0; j--) {
        		double average2 = (score[j][0] + score[j][1]) / (double) 2;
        		if(average1 > average2) answer[j]++;
        	}
        }
        
        return answer;
    }
}
