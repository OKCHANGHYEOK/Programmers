class Solution {
	public int solution(String s) {
		int answer = 0;

		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < s.length(); i++) {
			sb.append(s.charAt(i));
			if(sb.length() >= 2 && sb.charAt(sb.length() - 2) == sb.charAt(sb.length() - 1)) {
				sb.delete(sb.length() - 2, sb.length());
			}
		}
		
		if(sb.length() == 0) answer = 1;
		
		return answer;
	}
}