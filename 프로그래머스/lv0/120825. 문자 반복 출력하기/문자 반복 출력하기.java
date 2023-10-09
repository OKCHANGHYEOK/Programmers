class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        char[] tmps = new char[my_string.length()];
        for(int i = 0; i < my_string.length(); i++) {
            tmps[i] = my_string.charAt(i);
        }
        int size = my_string.length() * n;
        char[] tmps_ = new char[size];
        int k = 0;
        for(int i = 0; i < my_string.length(); i++) {
            for(int j = 0; j < n; j++) {
                tmps_[k] = tmps[i];
                k++;
            }
        }
        answer = new String(tmps_);
        return answer;
    }
}