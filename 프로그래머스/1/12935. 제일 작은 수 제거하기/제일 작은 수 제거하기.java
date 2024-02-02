import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        
        if(arr.length == 1) {
            answer = new int[] {-1};    // arr의 길이가 1이면 answer에는 -1만 넣는다
            return answer;              // 반환하고 종료
        }
        else answer = new int[arr.length - 1];  // 아니라면 answer는 arr보다 길이가 1만큼 작은 크기로 생성
        
        int min = Integer.MAX_VALUE;    // 최솟값을 찾기 위한 변수 준비
        
        for(int i = 0; i < arr.length; i++) {   // arr 길이만큼 반복을 돌리면서
            if(arr[i] < min) min = arr[i];      // arr의 i번째 값이 min보다 작으면 min에 대입
        }
        
        int k = 0; // answer의 인덱스용 변수
        
        for(int i = 0; i < arr.length; i++) {   // arr 길이만큼 반복을 돌리면서
            if(min == arr[i]) continue;   // arr의 i번째 값이 min에 해당하는 값이라면 배열에 넣지 않음 
            else {
                answer[k] = arr[i]; // 아니라면 answer의 k번째 자리에 arr의 i번째 자리의 값을 대입
                k++; // 인덱스 1증가
            }
        }
        
        return answer;
    }
}