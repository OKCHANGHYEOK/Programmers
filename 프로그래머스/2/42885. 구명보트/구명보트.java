import java.util.Arrays;

class Solution {
	public int solution(int[] people, int limit) {
		int answer = 0;

		Arrays.sort(people);
	
		int end = people.length - 1;
		for(int j = end; j > answer; j--) {
			int sum = people[answer] + people[j];
			if(people[j] == 0 || people[answer] == 0) continue;
			if(sum <= limit) {
				people[answer] = 0;
				people[j] = 0;
				answer++;
				end = people[end] != 0 ? end : end - 1;
				continue;
			}
		}
		
		for(int i = 0; i < people.length; i++) {
			answer += people[i] != 0 ? 1 : 0;
		}
		
		return answer;
	}
}