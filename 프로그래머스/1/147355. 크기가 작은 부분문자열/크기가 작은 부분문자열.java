import java.util.ArrayList;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        int len = p.length();
        
        ArrayList<String> list = new ArrayList<String>();
        
        for(int i = 0; i < t.length(); i++) {
            if(i + len > t.length()) {
                break;  // 범위 초과시 종료
            }
            String str = t.substring(i, i + len); // i번째 인덱스부터 p의 길이만큼 문자열 잘라내기
            list.add(str);
        }
        
        for(String s : list) {
            if(p.compareTo(s) >= 0) answer++;
        }
        
        return answer;
    }
}