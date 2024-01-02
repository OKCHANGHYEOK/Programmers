import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer;
        
        StringBuilder str_ans = new StringBuilder();
        for(int i = 0; i < answers.length; i++) {
        	str_ans.append(answers[i]);
        }
        
        Integer[][] jjikgi = {
        		{1, 2, 3, 4, 5},
        		{2, 1, 2, 3, 2, 4, 2, 5},
        		{3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        
     
        
        ArrayList<StringBuilder> list = new ArrayList<>();
        
        for(int i = 0; i < jjikgi.length; i++) {
        	StringBuilder sb = new StringBuilder();
        	int index = 0;
        	for(int j = 0; j < answers.length; j++) {
        		sb.append(String.valueOf(jjikgi[i][index]));
        		index++;
        		if(index >= jjikgi[i].length) index = 0;
        	}
        	list.add(sb);
        }
        
        
        LinkedHashMap<Integer, String> rank = new LinkedHashMap<>();
        
        for(int i = 0; i <= answers.length; i++) {
        	rank.put(i, "");
        }
        
        for(int i = 0; i < list.size(); i++) {
        	int count = 0;
        	for(int j = 0; j < str_ans.length(); j++) {
        		String s1 = list.get(i).substring(j, j + 1);
        		String s2 = str_ans.substring(j, j + 1);
        		if(s1.equals(s2)) count++; 
        	}
        	String origin = rank.get(count);
        	String newstr = origin + String.valueOf(i + 1);
        	rank.put(count, newstr);
        }
        
        int max_index = 0;
        String max = "";
        
        for(int i = 0; i < rank.size(); i++) {
        	if(!rank.get(i).equals("") && i > max_index) {
        		max_index = i;
        	}
        }
        
        max = rank.get(max_index);
        
        answer = new int[max.length()];
        
        for(int i = 0; i < max.length(); i++) {
        	answer[i] = Integer.valueOf(max.substring(i, i + 1));
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}


