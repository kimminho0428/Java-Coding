package sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DescendingString {

    public String solution(String s) {
        return s.chars()
                .boxed()
                .sorted((v1, v2) -> v2 - v1)
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString();

        /**
         * 다른 풀이
         */
        // char[] sol = str.toCharArray();
        //    Arrays.sort(sol);
        //    return new StringBuilder(new String(sol)).reverse().toString();
    }

    public static void main(String[] args) {
        DescendingString string = new DescendingString();
        String s = "Zbcdefg";
        String str = s.chars()
                .boxed()
                .sorted((v1, v2) -> v2 - v1)
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString();
        System.out.println("str = " + str);
    }

}
