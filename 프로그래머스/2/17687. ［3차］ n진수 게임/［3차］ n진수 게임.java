class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        int length = t * m;
        StringBuilder sb = new StringBuilder();
        int num = 0;
        while(sb.length() < length) {
            String s = Integer.toString(num, n);
            sb.append(s);
            num++;
        }

        for(int i = 0; i < sb.length(); i += m) {
           int index = p - 1 + i;
           answer += sb.charAt(index);
           if(answer.length() == t) break;
        }

        answer = answer.toUpperCase();

        return answer;
    }
}