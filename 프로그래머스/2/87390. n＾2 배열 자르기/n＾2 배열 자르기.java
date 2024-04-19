import java.util.ArrayList;

class Solution {
	public int[] solution(int n, long left, long right) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(long i = left; i <= right; i++) {
			long row = i % n + 1;
			long col = i / n + 1;
			int num = (int) (row > col ? row : col);
			list.add(num);
		}

		return list.stream().mapToInt(Integer::intValue).toArray();
	}
}