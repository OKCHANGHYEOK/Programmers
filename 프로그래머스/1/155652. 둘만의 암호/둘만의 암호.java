class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        char[] strArr = s.toCharArray();
        for(int i = 0; i < strArr.length; i++) {
        	for(int j = 0; j < index; j++) {
        		char tmp = ++strArr[i];
        		if(tmp > 122) {
                    strArr[i] = 97;
                    tmp = 97;
                }
        		while(skip.contains(String.valueOf(tmp))) {
                    tmp++;
        			strArr[i]++;
                    if(tmp > 122) {
                        strArr[i] = 97;
                        tmp = 97;
                    }
        		}
        	}
        }
        
        answer = new String(strArr);
        
        return answer;
    }
}
