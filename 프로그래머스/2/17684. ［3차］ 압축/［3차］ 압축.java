import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(String msg) {
        int[] answer = {};

        // 사전
        ArrayList<String> dictionary = new ArrayList<>();

        // 사전에 미리 A부터 Z까지 준비
        for(char i = 'A'; i <= 'Z' ; i++) {
            dictionary.add(String.valueOf(i));
        }

        // 인덱스 값을 저장할 리스트
        ArrayList<Integer> list = new ArrayList<>();

        // 압축 시작
        String w = "";

        for (int i = 0; i < msg.length(); i++) {
            String c = String.valueOf(msg.charAt(i));
            if (dictionary.contains(w + c)) {
                w = w + c;
            } else {
                list.add(dictionary.indexOf(w) + 1);
                dictionary.add(w + c);
                w = c;
            }
        }

        if(w.length() != 0) {
            list.add(dictionary.indexOf(w) + 1);
        }

        answer = list.stream().mapToInt(i -> i).toArray();

        return answer;
    }
}