import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int min = Integer.MAX_VALUE; // 가장 가까운 거리차
        int min_value = 0; // 가장 가까운 값
        int count = 0; // 가장 가까운 수가 중복되는지 체크할 변수
        int num1 = 0;
        int num2 = 0;
        
        Arrays.sort(array);
        
        for(int i = 0; i < array.length; i++) {
            int tmp = Math.abs(array[i] - n); // 배열의 각 값에서 n까지의 거리
            
            if(tmp <= min) { // 거리가 min보다 작거나 같으면
                if(tmp == min) {
                    count++;
                    num1 = min_value;
                    num2 = array[i];
                }
                min = tmp; // min을 tmp로 바꾸고
                min_value = array[i]; // 가장 가까운 값을 array의 i번째 값으로 한다
            }
        }
        
        if(count == 1) {
            answer = num1 < num2 ? num1 : num2;
            return answer;
        }

        answer = min_value;
        
        return answer;
    }
}