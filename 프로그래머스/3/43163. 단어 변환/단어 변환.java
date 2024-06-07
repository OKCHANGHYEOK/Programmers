import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        boolean found = false;

        for(int i = 0; i < words.length; i++) {
            if(target.equals(words[i])) {
                found = true;
                break;
            }
        }

        if(!found) return 0;

        return bfs(begin, target, words);
    }


    private int bfs(String begin, String target, String[] words) {
        int count = 0;

        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        queue.add(begin);
        visited.add(begin);
        int depth = 0;
        while(!queue.isEmpty()) {
            int size = queue.size();
            depth++;

            for(int i = 0; i < size; i++) {
                String word = queue.poll();
                if(word.equals(target)) {
                    return depth - 1;
                }

                for(int j = 0; j < words.length; j++) {
                    if(!visited.contains(words[j]) && changeable(word, words[j])) {
                        queue.add(words[j]);
                        visited.add(words[j]);
                    }
                }
            }

        }


        return count;
    }

    // a 에서 b 문자로 변환이 가능한지 체크하기 위한 메서드
    private boolean changeable(String a, String b) {
        int diff = 0;

        for(int i = 0; i < a.length(); i++) {
            if(a.charAt(i) != b.charAt(i)) {
                diff++;
            }
        }

        return diff == 1;
    }
}