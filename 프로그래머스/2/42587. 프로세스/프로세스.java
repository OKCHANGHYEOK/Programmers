import java.util.ArrayList;
import java.util.LinkedList;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;

        ArrayList<Character> list = new ArrayList<>();
        char find = (char) (location + 65);

        LinkedList<Character> wordQ = new LinkedList<Character>();
        LinkedList<Integer> priorQ = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            char tmp = (char) (i + 65);
            wordQ.add(tmp);
            priorQ.add(priorities[i]);
        }

        while (!wordQ.isEmpty()) {
            int max = 0;
            for(int i = 0; i < priorQ.size(); i++) {
                max = Math.max(max, priorQ.get(i));
            }

            char curr = wordQ.peek();
            int currP = priorQ.peek();

            if(priorQ.peek() == max) {
                list.add(wordQ.poll());
                priorQ.poll();
            }
            else {
                wordQ.poll();
                wordQ.add(curr);
                priorQ.poll();
                priorQ.add(currP);
            }
        }


        answer = list.indexOf(find) + 1;

        return answer;
    }
}