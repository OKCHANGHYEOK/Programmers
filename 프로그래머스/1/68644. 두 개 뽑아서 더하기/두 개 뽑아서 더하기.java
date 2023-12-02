import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        HashSet<Integer> hs = new HashSet<>();
        
        for(int i = 0; i < numbers.length; i++) {
        	for(int j = 0; j < numbers.length; j++) {
                if(i != j) {
                    int sum = numbers[i] + numbers[j];
        		    hs.add(sum); 
                }

        	}
        }
        
        List<Integer> list = new ArrayList<>(hs);
        

        int[] arr = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        
        answer = arr;
        
        Arrays.sort(arr);
        
        return answer;
    }
}