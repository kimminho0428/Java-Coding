package hash;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateString {

    public String solution(String my_string) {
        Set<Character> used = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (char ch : my_string.toCharArray()){
            if (used.contains(ch)) continue;
            used.add(ch);
            sb.append(ch);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        RemoveDuplicateString removeDuplicateString = new RemoveDuplicateString();
        String my_string = "people";
        String solution = removeDuplicateString.solution(my_string);
        System.out.println("solution = " + solution);
        String my_string2 = "We are the world";
        String solution1 = removeDuplicateString.solution(my_string2);
        System.out.println("solution1 = " + solution1);
    }

}
