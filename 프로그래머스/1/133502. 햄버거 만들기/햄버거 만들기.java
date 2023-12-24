class Solution { 
    public int solution(int[] ingredient) {
    	int answer = 0;
        
    	String burger = "1231";
    	StringBuilder sb = new StringBuilder("");
    	for(int i = 0; i < ingredient.length; i++) {
    		sb.append(String.valueOf(ingredient[i]));
    		if(sb.length() > 3 && sb.substring(sb.length() - 4, sb.length()).equals(burger)) {
    			answer++;
    			sb = sb.replace(sb.length() - 4, sb.length(), "");
    		}
    	}
    	
    	
 
        return answer;
    }
}