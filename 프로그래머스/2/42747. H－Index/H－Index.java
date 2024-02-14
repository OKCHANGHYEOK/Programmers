import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        List<Integer> list = Arrays.stream(citations)
        		.boxed().collect(Collectors.toList());
        
        
        list.sort((n1, n2) -> n2 - n1);
        
        for(int i = 0; i <= list.size(); i++) {
        	int count = 0;
        	for(int j = 0; j < list.size(); j++) {
        		if(list.get(j) >= i) {
        			count++;
        		}
        	}
        	if(count <= i) {
        		answer = count;
        		break;
        	}
        }
        
        return answer;
    }
}