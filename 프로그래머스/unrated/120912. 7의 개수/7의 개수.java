import java.util.ArrayList;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        ArrayList<String> list = new ArrayList<>();
        
        for(int num : array) {
            list.add(String.valueOf(num));
        }
        
        for(String str : list) {
            for(int i = 0; i < str.length(); i++) {
                if(str.substring(i, i + 1).equals("7")) answer++;
            }
        }
        
        return answer;
    }
}