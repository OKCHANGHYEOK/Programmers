import java.util.HashMap;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        HashMap<String, Integer> map = new HashMap<>();
        for (String key : keymap) {
            for (int j = 0; j < key.length(); j++) {
                String s = key.substring(j, j + 1);
                if (!map.containsKey(s)) {
                    map.put(s, key.indexOf(s));
                } else {
                    map.put(s, Math.min(map.get(s), key.indexOf(s)));
                }
            }
        }


        for(int i = 0; i < targets.length; i++) {
            for(int j = 0; j < targets[i].length(); j++) {
                String s = targets[i].substring(j, j + 1);
                if(map.get(s) == null) {
                    answer[i] = -1;
                    break;
                }
                answer[i] += map.get(s) + 1;
            }
        }

        return answer;
    }
}