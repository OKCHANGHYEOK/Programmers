class Solution {
    public String solution(String polynomial) {
        String answer = "";
        
        String[] arr = polynomial.split(" \\+ ");
        
        String xhang = "";
        int sangsuhang = 0;
        int gyesu = 0;
        
        for(int i = 0; i < arr.length; i++) {
        	if(arr[i].contains("x")) {
        		String tmp = arr[i].replace("x", "");
        		if(tmp.equals("")) {
        			gyesu += 1;
        		}
        		else {
        			gyesu += Integer.valueOf(tmp);
        		}
        	}
        	else {
        		sangsuhang += Integer.valueOf(arr[i]);
        	}
        }
        
        // x항이 존재할 때
        if(gyesu != 0) {
            xhang = gyesu == 1 ? "x" : gyesu + "x";
            // 상수항의 존재 여부에 따라 answer의 값을 정한다
            answer = sangsuhang == 0 ? xhang : xhang + " + " + sangsuhang; 
        }
        // x항이 존재하지 않을 때
        else {
        	answer = String.valueOf(sangsuhang);
        }
        

 
        
        
        return answer;
    }
}