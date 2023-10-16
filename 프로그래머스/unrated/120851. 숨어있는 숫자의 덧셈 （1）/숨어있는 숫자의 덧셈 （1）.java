class Solution {
    public int solution(String my_string) {
        int answer = 0;
        char[] tmp = new char[my_string.length()];
        for(int i = 0; i < my_string.length(); i++) {
            tmp[i] = my_string.charAt(i);
        }
        for(int i = 0; i < tmp.length; i++) {
            int tmp_num = Character.getNumericValue(tmp[i]);
            if(tmp_num > 0 && tmp_num < 10) answer += tmp_num;
        }
        return answer;
    }
}