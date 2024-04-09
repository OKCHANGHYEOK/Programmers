class Solution {
	public int solution(int n, int a, int b) {
		int answer = 1;
		
		int big = a > b ? a : b;
		int small = a > b ? b : a;
		
		
		while(big - small != 1 || big - small == 1 && (big + small) % 4 != 3) {
			big = big % 2 == 0 ? big / 2 : big / 2 + 1;
			small = small % 2 == 0 ? small / 2 : small / 2 + 1;
			answer++;
		}
		
		return answer;
	}
}
