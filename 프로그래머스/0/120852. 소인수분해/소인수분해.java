import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        
        int start = 2;
        
        while(n != 1) {
            if(n % start == 0) {
                if(answer.contains(start) != true) answer.add(start);
                n /= start;
            }
            else {
                start++;
            }
        }
        
        int size = answer.size();
        int[] result = new int[size];
        
        for(int i = 0; i < size; i++) {
            result[i] = answer.get(i);
        }
        
        return result;
    }
}