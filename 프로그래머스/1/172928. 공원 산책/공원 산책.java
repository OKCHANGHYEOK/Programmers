import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = {0, 0};

        for(int i = 0; i < park.length; i++) {
            String start = park[i];
            if(start.contains("S")) {
                answer[0] = i;
                answer[1] = start.indexOf("S");
                break;
            }
        }


        int[][] maps = new int[park.length][park[0].length()];
        for(int i = 0; i < park.length; i++) {
            for(int j = 0; j < park[i].length(); j++) {
                char tmp = park[i].charAt(j);
                if(tmp == 'S' || tmp == 'O') {
                    maps[i][j] = 0;
                }
                else {
                    maps[i][j] = 1;
                }
            }
        }

        HashMap<String, Integer> map = new HashMap<>();
        map.put("N", -1);
        map.put("E", 1);
        map.put("W", -1);
        map.put("S", 1);

        Queue<String[]> q = new LinkedList<>();
        for(int i = 0; i < routes.length; i++) {
            String[] tmp = routes[i].split(" ");
            q.add(tmp);
        }

        while(!q.isEmpty()) {
            String[] operation = q.poll();
            String dir = operation[0];
            int dis = Integer.parseInt(operation[1]);
            int[] original = new int[2];
            original[0] += answer[0];
            original[1] += answer[1];

            for(int i = 0; i < dis; i++) {
                if(dir.equals("N") || dir.equals("S")) {
                    int newRow = answer[0] + map.get(dir);
                    if(newRow >= 0 && newRow < maps.length && maps[newRow][answer[1]] == 0) {
                        answer[0] = newRow;
                    }
                    else {
                        answer[0] = original[0];
                        break;
                    }
                }
                else {
                    int newCol = answer[1] + map.get(dir);
                    if(newCol >= 0 && newCol < maps[0].length && maps[answer[0]][newCol] == 0) {
                        answer[1] = newCol;
                    }
                    else {
                        answer[1] = original[1];
                        break;
                    }
                }
            }
        }

        return answer;
    }
}