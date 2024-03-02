import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] arr = s.split("");
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            if(!list.contains(arr[i])) list.add(arr[i]);
        }
        
        for(int i = 0; i < list.size(); i++) {
            int count = 0;
        
            for(int j = 0; j < arr.length; j++) {
                if(list.get(i).equals(arr[j])) count++;
            }
            
            if(count == 1) answer += list.get(i);
        }
        
        char[] chars = answer.toCharArray();
        Arrays.sort(chars);
        answer = new String(chars);
        
        return answer;
    }
}