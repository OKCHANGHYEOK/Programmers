import java.util.Arrays;

class Solution {
    public int solution(int[][] routes) {
        int answer = 1;

        Arrays.sort(routes, (o1, o2) -> o1[1] - o2[1]);
        int camera = routes[0][1];

        for(int i = 0; i < routes.length - 1; i++) {
            if(routes[i + 1][0] > camera) {
                camera = routes[i + 1][1];
                answer++;
            }
        }


        return answer;
    }
}
