class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] tmps = new char[my_string.length()];
        int k = my_string.length() - 1;
        for(int i = 0; i < my_string.length(); i++) {
            tmps[i] = my_string.charAt(k);
            k--;
        }
        answer = new String(tmps);
        return answer;
    }
}