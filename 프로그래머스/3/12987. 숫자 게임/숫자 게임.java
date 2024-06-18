import java.util.Arrays;

class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < A.length; i++) {
            int curr = A[i];
            for(int j = i; j < B.length; j++) {
                if(B[j] > curr) {
                    B[j] = 0;
                    answer++;
                    break;
                }
            }
        }

        return answer;
    }
}