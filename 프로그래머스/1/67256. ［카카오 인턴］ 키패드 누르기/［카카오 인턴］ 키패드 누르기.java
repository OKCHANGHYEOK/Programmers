class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        
        int left = -1;
        int right = -1;
        

        
        
        for(int i = 0; i < numbers.length; i++) {
        	if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
        		answer += "L";
        		left = numbers[i];
        	}
        	else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
        		answer += "R";
        		right = numbers[i];
        	}
        	else {
        		int leftd = 0;	// 왼손으로부터의 거리
        		int rightd = 0; // 오른손으로부터의 거리
        		if(numbers[i] == 2) {
        			if(left == 1 || left == 5) leftd = 1;
        			if(left == 2) leftd = 0;
        			if(left == 4 || left == 8) leftd = 2;
        			if(left == 7 || left == 0) leftd = 3;
        			if(left == -1) leftd = 4;
        			if(right == 2) rightd = 0;
        			if(right == 3 || right == 5) rightd = 1;
        			if(right == 6 || right == 8) rightd = 2;
        			if(right == 9 || right == 0) rightd = 3;
        			if(right == -1) rightd = 4;
        		}
        		if(numbers[i] == 5) {
        			if(left == 1 || left == 7 || left == 0) leftd = 2;
        			if(left == 4 || left == 2 || left == 8) leftd = 1;
        			if(left == 5) leftd = 0;
        			if(left == -1) leftd = 3;
        			if(right == 3 || right == 9 || right == 0) rightd = 2;
        			if(right == 5) rightd = 0;
        			if(right == 6 || right == 2 || right == 8) rightd = 1;
        			if(right == -1) rightd = 3;
        		}
        		if(numbers[i] == 8) {
        			if(left == 1) leftd = 3;
        			if(left == 4 || left == 2 || left == -1) leftd = 2;
        			if(left == 7 || left == 5 || left == 0) leftd = 1;
        			if(left == 8) leftd = 0;
        			if(right == 3) rightd = 3;
        			if(right == 6 || right == 2 || right == -1) rightd = 2;
        			if(right == 8) rightd = 0;
        			if(right == 9 || right == 5 || right == 0) rightd = 1;
        		}
        		if(numbers[i] == 0) {
        			if(left == 0) leftd = 0;
        			if(left == 1) leftd = 4;
        			if(left == 4 || left == 2) leftd = 3;
        			if(left == 7 || left == 5) leftd = 2;
        			if(left == 8 || left == -1) leftd = 1;
        			if(right == 0) rightd = 0;
        			if(right == 3) rightd = 4;
        			if(right == 6 || right == 2) rightd = 3;
        			if(right == 9 || right == 5) rightd = 2;
        			if(right == 8 || right == -1) rightd = 1;
        		}
        		
        		if(leftd < rightd) {
        			answer += "L";
        			left = numbers[i]; 
        		}
        		else if(leftd > rightd) {
        			answer += "R";
        			right = numbers[i];
        		}
        		else {
        			answer += hand.equals("left") ? "L" : "R";
        			if(hand.equals("left")) left = numbers[i];
        			else right = numbers[i];
        		}
        	}
        }
        
        return answer;
    }
}