import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = {};
        
        
        Comparator<Integer> comp = new Comparator<Integer>() {    	
			@Override
			public int compare(Integer o1, Integer o2) {
				int n1 = o1 - n;
				int n2 = o2 - n;
				
				n1 = Math.abs(n1);
				n2 = Math.abs(n2);
				
				if(n1 == n2) {
					return o2 - o1;
				}
				return n1 - n2;
			}
		};
		
		
		Integer[] tmp = Arrays.stream(numlist).boxed().toArray(Integer[]::new);
		Arrays.sort(tmp, comp);
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(tmp));
		answer = list.stream().mapToInt(Integer::intValue).toArray();
		
        return answer;
    }
}