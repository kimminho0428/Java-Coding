package sort;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BiggestNumber {

    public String solution(int[] numbers) {
        return Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .sorted((s1, s2) -> {
                    int original = Integer.parseInt(s1 + s2);
                    int reversed = Integer.parseInt(s2 + s1);
                    return reversed - original;
                })
                .collect(Collectors.joining(""))
                .replaceAll("^0+", "0");
    }

    public static void main(String[] args) {
        int[] numbers = {6, 10, 2};
        BiggestNumber number = new BiggestNumber();
        String solution = number.solution(numbers);
        System.out.println("solution = " + solution);
    }



}
