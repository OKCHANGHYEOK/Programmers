class Solution {
    int answer = 0;
    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        explore(k, dungeons, visited, 0);
        return answer;
    }

    private void explore(int k, int[][] dungeons, boolean[] visited, int i) {
        answer = Math.max(answer, i);
        for(int j = 0; j < dungeons.length; j++) {
            if(!visited[j] && k >= dungeons[j][0]) {
                visited[j] = true;
                explore(k - dungeons[j][1], dungeons, visited, i + 1);
                visited[j] = false;
            }
        }
    }
}