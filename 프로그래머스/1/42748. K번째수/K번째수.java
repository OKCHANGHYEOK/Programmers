import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        // 전체 반복횟수는 commands의 길이만큼 반복
        for(int i = 0; i < commands.length; i++) {
            // 잘라낸 배열을 저장할 배열을 준비
            int[] tmp = new int[commands[i][1] - commands[i][0] + 1]; // 배열의 길이는 commands[i][1] 에서
                                                                      // commands[i][0] 을 빼고 1을 더한 값
            int k = 0; // tmp의 인덱스를 담당할 변수
            
            // 배열을 잘라낼 반복
            // array에서 commands의 i,0 번째 인덱스값이 반복 시작점,  
            // commands의 i, 1번째 인덱스값이 반복 종료점
            for(int j = commands[i][0] - 1; j < commands[i][1]; j++) {
                tmp[k] = array[j];  // tmp에 배열의 j번째 인덱스의 값 저장
                k++;    // tmp의 다음 인덱스로 k를 증가시킨다
            }
            
            Arrays.sort(tmp);   // 잘라낸 배열 tmp를 정렬
            
            answer[i] = tmp[commands[i][2] - 1]; // answer의 i번째 인덱스에 
                                             // tmp의 commands[i][2]를 저장
        }
        
        return answer;
    }
}