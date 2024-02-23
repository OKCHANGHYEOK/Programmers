import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        ArrayList<int[]> list = new ArrayList<>(Arrays.asList(dots));
        
        list.sort((o1, o2) -> o1[0] - o2[0]);

        
        ArrayList<Double> giwoolgis = new ArrayList<>(); 
        
        int[] jum1 = list.get(0);
        int[] jum2 = list.get(1);
        int[] jum3 = list.get(2);
        int[] jum4 = list.get(3);
        
        double giwoolgi1 = (double)(jum2[1] - jum1[1]) / (jum2[0] - jum1[0]);
        double giwoolgi2 = (double)(jum4[1] - jum3[1]) / (jum4[0] - jum3[0]);
        double giwoolgi3 = (double)(jum4[1] - jum1[1]) / (jum4[0] - jum1[0]);
        double giwoolgi4 = (double)(jum3[1] - jum2[1]) / (jum3[0] - jum2[0]);
        double giwoolgi5 = (double)(jum3[1] - jum1[1]) / (jum3[0] - jum1[0]);
        double giwoolgi6 = (double)(jum4[1] - jum2[1]) / (jum4[0] - jum2[0]);
        
        if(giwoolgi1 == giwoolgi2) answer = 1;
        if(giwoolgi3 == giwoolgi4) answer = 1;
        if(giwoolgi5 == giwoolgi6) answer = 1;
    
        
  
        
        return answer;
    }
}