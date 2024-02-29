class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        char[] strArr = s.toCharArray();
        for(int i = 0; i < strArr.length; i++) {
        	for(int j = 0; j < index; j++) {
                ++strArr[i];
        		if(strArr[i] > 122) strArr[i] = 97;
        		while(skip.contains(String.valueOf(strArr[i]))) {
        			strArr[i]++;
                    if(strArr[i] > 122) strArr[i] = 97;
        		}
        	}
        }
        
        answer = new String(strArr);
        
        return answer;
    }
}
