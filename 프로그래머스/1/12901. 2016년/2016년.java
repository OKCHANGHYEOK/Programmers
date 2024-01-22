import java.util.LinkedHashMap;

class Solution {
    public String solution(int a, int b) {
        String answer = "";
        
        LinkedHashMap<Integer, Integer> hm = new LinkedHashMap<>();
        hm.put(1, 31);
        hm.put(2, 29);
        hm.put(3, 31);
        hm.put(4, 30);
        hm.put(5, 31);
        hm.put(6, 30);
        hm.put(7, 31);
        hm.put(8, 31);
        hm.put(9, 30);
        hm.put(10, 31);
        hm.put(11, 30);
        hm.put(12, 31);
        
        int dayCount = 0;
        for(int i = 1; i < a; i++) {
        	dayCount += hm.get(i);
        }
        
        dayCount += b;
        
        LinkedHashMap<Integer, String> day = new LinkedHashMap<Integer, String>();
        day.put(1, "FRI");
        day.put(2, "SAT");
        day.put(3, "SUN");
        day.put(4, "MON");
        day.put(5, "TUE");
        day.put(6, "WED");
        day.put(7, "THU");
        
        int count = dayCount % 7 == 0 ? 7 : dayCount % 7;
        answer = day.get(count);
        
        return answer;
    }
}