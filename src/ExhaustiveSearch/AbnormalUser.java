package ExhaustiveSearch;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AbnormalUser {

    private void count(int index, Set<String> banned,
                       String [][] bans, Set<Set<String>> banSet){
        if (index == bans.length){
            banSet.add(new HashSet<>(banned));
            return;
        }
        for (String id : bans[index]){
            if (banned.contains(id)) continue;
            banned.add(id);
            count(index + 1, banned, bans, banSet);
            banned.remove(id);
        }
    }

    public int solution(String[] user_id, String[] banned_id) {
        String[][] bans = Arrays.stream(banned_id)
                .map(banned -> banned.replace('*', '.'))
                .map(banned -> Arrays.stream(user_id)
                        .filter(id -> id.matches(banned))
                        .toArray(String[]::new))
                .toArray(String[][]::new);
        Set<Set<String>> banSet = new HashSet<>();
        count(0, new HashSet<>(), bans, banSet);
        return banSet.size();
    }

    public static void main(String[] args) {
        AbnormalUser abnormalUser = new AbnormalUser();
        String[] user_id = {"frodo", "fradi", "crodo", "abc123", "frodoc"};
        String[] banned_id = {"fr*d*", "abc1**"};
        String[][] bans = Arrays.stream(banned_id)
                .map(banned -> banned.replace('*', '.'))
                .map(banned -> Arrays.stream(user_id)
                        .filter(id -> id.matches(banned))
                        .toArray(String[]::new))
                .toArray(String[][]::new);
        System.out.println("bans = " + Arrays.deepToString(bans));
        int solution = abnormalUser.solution(user_id, banned_id);
        System.out.println("solution = " + solution);
    }
}
