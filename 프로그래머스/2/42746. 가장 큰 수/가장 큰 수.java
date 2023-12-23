import java.util.ArrayList;


class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < numbers.length; i++) {
        	list.add(String.valueOf(numbers[i]));
        }
        
        int sum = 0;
        for(int i = 0; i < list.size(); i++) {
        	sum += Integer.valueOf(list.get(i));
        }
        
        if(sum == 0) {
            return "0";
        }
        
        list.sort((s1, s2) -> (s2 + s1).compareTo(s1 + s2));
        
        

		StringBuilder sb = new StringBuilder();
        for(int i = 0; i < list.size(); i++) {
        	sb.append(list.get(i));
        }
        
        answer = sb.toString();
		
        return answer;
    }
}