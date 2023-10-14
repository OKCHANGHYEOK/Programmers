class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] moeum = {"a", "e", "i", "o", "u"};
        String[] tmps = new String[5];
        for(int i = 0; i < tmps.length; i++) {
	        if(i == 0) tmps[i] = my_string.replace(moeum[i], "");
	        else tmps[i] = tmps[i-1].replace(moeum[i], "");
        }
        answer = tmps[4];
        return answer;
    }
}