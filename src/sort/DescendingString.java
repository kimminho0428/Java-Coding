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
        String solution = string.solution(s);
        System.out.println("solution = " + solution);

        /**
         * 람다 객체를 사용한 정렬
         */
        // 1. 오름 차순 정렬
        int[] arr = {5, 3, 7, 4, 7, 4, 0, 9};
        int[] ascArray = Arrays.stream(arr)
                .boxed()
                .sorted((v1, v2) -> v1 - v2)
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.println("ascArray = " + Arrays.toString(ascArray));

        // 2. 내림 차순 정렬
        int[] descArray = Arrays.stream(arr)
                .boxed()
                .sorted((v1, v2) -> v2 - v1)
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.println("descArray = " + Arrays.toString(descArray));

        // 3. 사전 순서인 문자열을 문자열의 길이가 작은 순서대로 정렬
        String[] words = {"java", "algorithm", "programming", "happy", "fun", "coding"};
        Arrays.sort(words, (v1, v2) -> v1.length() - v2.length());
        System.out.println("words length asc = " + Arrays.toString(words));

        // 4. 사전 순서인 문자열을 문자열의 길이가 큰 순서대로 정렬
        Arrays.sort(words, (v1, v2) -> v2.length() - v1.length());
        System.out.println("words length desc = " + Arrays.toString(words));

    }

}
