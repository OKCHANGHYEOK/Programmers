import java.util.Arrays;

class Solution {
    public int[] solution(int N, int[] stages) {
    	Arrays.sort(stages);
    	int size = stages[stages.length - 1] > N ? stages[stages.length - 1] - 1 : N;
        int[] answer = new int[size];
        
        
        
        int[][] failure = new int[size][3];
        for(int i = 0; i < failure.length; i++) {
        	failure[i][0] = i + 1;
        }
        
        for(int i = 0; i < stages.length; i++) {
        	for(int j = 0; j < failure.length; j++) {
        		if(stages[i] > failure[j][0]) {
        			failure[j][1]++;
        			failure[j][2]++;
        		}
        		if(stages[i] == failure[j][0]) {
        			failure[j][2]++;
        		}
        	}
        }
        
        
        Arrays.sort(failure, (a1, a2) -> comp(a1, a2));
        

        for(int i = 0; i < failure.length; i++) {
        	answer[i] = failure[i][0];
        }


        return answer;
    }
    
    // 성공률이 낮은(실패율이 높은)순으로 정렬하기 위해 사용할 비교자
    public int comp(int[] a1, int[] a2) {
    	int num = 0;
    	
    	double f1 = (double)a1[1] / a1[2];
    	double f2 = (double)a2[1] / a2[2];
    	
    	if(f1 == f2) num = a1[0] - a2[0];
    	else num = Double.compare(f1, f2);
    	
    	
    	return num;
    }
    
}