import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public String[] solution(String[] record) {
        String[] answer = {};

        HashMap<String, String> users = new HashMap<>();
        ArrayList<String> messages = new ArrayList<>();
        for(int i = 0; i < record.length; i++){
            String[] words = record[i].split(" ");
            String command = words[0];
            String userid = words[1];

            if(command.equals("Enter")) {
                String username = words[2];
                String msg = userid + "*님이 들어왔습니다.";
                messages.add(msg);
                users.put(userid, username);
            }
            if(command.equals("Leave")) {
                String msg = userid + "*님이 나갔습니다.";
                messages.add(msg);
            }
            if(command.equals("Change")) {
                String username = words[2];
                users.put(userid, username);
            }
        }

        for(int i = 0; i < messages.size(); i++) {
            String msg = messages.get(i);
            String userId = msg.split("\\*")[0];
            String userName = users.get(userId);
            msg = msg.replace(userId, userName).replace("*", "");
            messages.set(i, msg);
        }

        answer = new String[messages.size()];

        for(int i = 0; i < messages.size(); i++){
            answer[i] = messages.get(i);
        }

        return answer;
    }
}
