package sort;

import java.util.Arrays;

public class MySortingString {

    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (s1, s2) -> {
                    if(s1.charAt(n) != s2.charAt(n)){
                        return s1.charAt(n) - s2.charAt(n);
                    }
                    return s1.compareTo(s2);
                });
        return strings;
    }

    public static void main(String[] args) {
        String[] strings = {"sun", "bed", "car"};
        int n = 1;
        MySortingString sortingString = new MySortingString();
        String[] solution = sortingString.solution(strings, n);
        System.out.println("solution = " + Arrays.toString(solution));

    }

}
