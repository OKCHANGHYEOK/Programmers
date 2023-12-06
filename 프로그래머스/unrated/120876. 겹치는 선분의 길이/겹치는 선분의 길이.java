import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        
        ArrayList<int[]> list = new ArrayList<>();
        
        for(int i = 0; i < lines.length; i++) {
            int k = 0;
            int[] tmp = new int[lines[i][1] - lines[i][0]];
            for(int j = lines[i][0]; j < lines[i][1]; j++) {
                tmp[k] = j;
                k++;
            }
            list.add(tmp);
        }
        
        HashSet<Integer> overlap = new HashSet<>();
        
        for(int i = 0; i < list.size(); i++) {

            for(int j = i + 1; j < list.size(); j++) {
                int[] tmp1 = list.get(i);
                int[] tmp2 = list.get(j);
                
                for(int k = 0; k < tmp1.length; k++) {
                    for(int l = 0; l < tmp2.length; l++) {
                        if(tmp1[k] == tmp2[l]) {
                            overlap.add(tmp1[k]);
                        }
                    }
                }
            }
        }
        
        answer = overlap.size();
        
        return answer;
    }
}