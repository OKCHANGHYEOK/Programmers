import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        ArrayList<String> list = new ArrayList<String>(); 
        
        for(int i = 0; i < words.length; i++) {
        	boolean isCorrect = true;
        	// 첫번째 사람의 순서로 돌아올때마다 차례수 증가
        	if((i + 1) % n == 1) answer[1]++;
        	answer[0] = (i + 1) % n == 0 ? n : (i + 1) % n; // 몇번째 사람의 순서인가
        	if(i >= 1) {
        		String last = list.get(list.size() - 1);
        		isCorrect = last.charAt(last.length() - 1) == words[i].charAt(0);
        		System.out.println(last);
        	}
        	if(!list.contains(words[i]) && isCorrect) {
        		list.add(words[i]); // 리스트에 존재하지 않으면서 이전 단어의 끝문자와 다음 단어의 첫문자가 같다면 리스트에 추가하고
        	}
        	else {
        		break;	// 두 조건 중 하나라도 맞지 않으면 반복종료
        	}
        	
        }
        
        if(list.size() == words.length) {
        	answer[0] = 0;
        	answer[1] = 0;        	
        }

        
        return answer;
    }
}
