import java.util.*;

class Solution {
    String[] command = {"U", "D", "R", "L"};
    int[] dx = {0, 0, 1, -1};
    int[] dy = {1, -1, 0, 0};

    public int solution(String dirs) {
        int answer = 0;
        int[] position = {0, 0};
        Set<String> set = new HashSet<>();

        for(int i = 0; i < dirs.length(); i++) {
            String dir = dirs.substring(i, i + 1);
            int[] move = getPosition(position, dir);
            if(move[0] != -10) {
                String str1 = String.valueOf(position[0] + 10) + String.valueOf(position[1] + 10);
                String str2 = String.valueOf(move[0] + 10) + String.valueOf(move[1] + 10);
                String[] arr = {str1, str2};
                Arrays.sort(arr);
                set.add(arr[0] + arr[1]);
                position = move;
            }
        }



        answer = set.size();

        return answer;
    }

    // 다음으로 이동할 좌표를 구하는 메서드
    private int[] getPosition(int[] curr, String dir) {
        int[] pos = new int[2];

        for(int i = 0; i < command.length; i++) {
            if(dir.equals(command[i])) {
                pos[0] = curr[0] + dx[i];
                pos[1] = curr[1] + dy[i];

                if(Math.abs(pos[0]) > 5 || Math.abs(pos[1]) > 5) {
                    pos[0] = -10;
                }


                break;
            }
        }

        return pos;
    }
}