import java.util.ArrayList;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        
        // 각 시도별로 얻은 점수를 저장할 리스트
        ArrayList<Integer> score = new ArrayList<Integer>();
        StringBuilder sb = new StringBuilder();
        int index = 0; // 시도 횟수
        
        for(int i = 0; i < dartResult.length(); i++) {
        	String str = dartResult.substring(i, i + 1);
        	if(!str.equals("*") && !str.equals("#"))sb.append(str);
        	switch(str) {
        	case "S":
        		int s = Integer.valueOf(sb.substring(0, sb.length() - 1));
        		score.add(s);
        		sb = new StringBuilder();
        		index++;
        		break;
        	case "D":
        		int d = Integer.valueOf(sb.substring(0, sb.length() - 1));
        		d = (int)Math.pow(d, 2);
        		score.add(d);
        		sb = new StringBuilder();
        		index++;
        		break;
        	case "T":
        		int t = Integer.valueOf(sb.substring(0, sb.length() - 1));
        		t = (int)Math.pow(t, 3);
        		score.add(t);
        		sb = new StringBuilder();
        		index++;
        		break;
        	case "*":
        		if(index == 1) {
        			score.set(0, score.get(0) * 2);
        		}
        		else {
            		for(int j = index - 1; j >= index - 2; j--) {
            			score.set(j, score.get(j) * 2);
            		}
        		}
        		break;
        	case "#":
        		score.set(index - 1, score.get(index - 1) * -1);
        		break;
        	}
 
        }
        

        
        for(int i : score) answer += i;
        
        return answer;
    }
}