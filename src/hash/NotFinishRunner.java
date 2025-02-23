package hash;

import java.util.HashMap;
import java.util.Map;

public class NotFinishRunner {

    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> count = new HashMap<>();

        for (String name : participant){
            count.putIfAbsent(name, 0);
            count.put(name, count.get(name) + 1);
        }

        for (String name : completion){
            int v = count.get(name) - 1;
            count.put(name, v);
            if (v == 0) count.remove(name);
        }

        return count.keySet().iterator().next();
    }

    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        NotFinishRunner notFinishRunner = new NotFinishRunner();
        String solution = notFinishRunner.solution(participant, completion);
        System.out.println("solution = " + solution);
    }

}
