import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class Solution {
    public String[] solution(String[] strings, int n) {     
        // strings 배열의 길이만큼 반복하면서
        for(int i = 0; i < strings.length; i++) {    
            // strings에 있는 각 문자열을 문자열의 n번째 문자를 기준으로 정렬을 수행한다
            Arrays.sort(strings, (s1, s2) -> s1.charAt(n) - s2.charAt(n));
        }
        /* 문자열의 n번째 문자값을 기준으로 정렬 완료 */
        
        
        
        // 문자열의 n번째 문자값이 같은 문자가 여러개인 경우 사전순으로 정렬
        for(int i = 0; i < strings.length; i++) {
            for(int j = i + 1; j < strings.length; j++) {
                // 앞의 문자열의 n번째 문자값과 뒤의 문자열의 n번째 문자값이 똑같다면
                if(strings[i].charAt(n) == strings[j].charAt(n)) {
                    // 그리고 앞의 문자열과 뒤의 문자열을 비교한 값이 0보다 크면
                    if(strings[i].compareTo(strings[j]) > 0) {
                        // 앞의 문자열과 뒤의 문자열의 위치를 바꾼다
                        String tmp = strings[i];
                        strings[i] = strings[j];
                        strings[j] = tmp;
                    }
                }
            }
        }
        /* 사전순으로 정렬 완료 */
        
        
        // 최종적으로 정렬된 배열 strings를 answer로 복사
        String[] answer = Arrays.copyOf(strings, strings.length);
        
        return answer;
    }
}