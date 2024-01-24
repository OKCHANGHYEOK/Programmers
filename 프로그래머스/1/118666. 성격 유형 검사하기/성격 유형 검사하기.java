import java.util.LinkedHashMap;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        
        
        // 각 유형별 점수
        LinkedHashMap<String, Integer> score = new LinkedHashMap<String, Integer>();
        score.put("A", 0);
        score.put("N", 0);
        score.put("C", 0);
        score.put("F", 0);
        score.put("M", 0);
        score.put("J", 0);
        score.put("R", 0);
        score.put("T", 0);
        
        for(int i = 0; i < survey.length; i++) {
        	String left = survey[i].substring(0, 1); // 비동의 쪽
        	String right = survey[i].substring(1, 2); // 동의 쪽
        	int leftScore = score.get(left);
        	int rightScore = score.get(right);
        	
        	if(choices[i] < 4) {
        		score.put(left, leftScore + 4 - choices[i]);
        	}
        	if(choices[i] > 4) {
        		score.put(right, rightScore + choices[i] - 4);
        	}
        }
        

        answer += score.get("R") > score.get("T") || score.get("R") == score.get("T") ? "R" : "T";
        answer += score.get("C") > score.get("F") || score.get("C") == score.get("F") ? "C" : "F";
        answer += score.get("J") > score.get("M") || score.get("J") == score.get("M") ? "J" : "M";
        answer += score.get("A") > score.get("N") || score.get("A") == score.get("N") ? "A" : "N";
        
        
        return answer;
    }
}