class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        // 왼쪽 선수가 먹을 음식 배치
        for(int i = 1; i < food.length; i++) {
        	int count = food[i] / 2;
        	for(int j = 0; j < count; j++) {
        		answer += i;
        	}
        }
        
        // 왼쪽 선수가 먹을 음식 배치가 끝났으므로 물을 배치하고
        answer += 0;
        
        // 오른쪽 선수가 먹을 음식 배치
        for(int i = food.length - 1; i > 0; i--) {
        	int count = food[i] / 2;
        	for(int j = 0; j < count; j++) {
        		answer += i;
        	}
        }
        
        return answer;
    }
}