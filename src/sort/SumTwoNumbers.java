package sort;

import java.util.*;
import java.util.stream.Collectors;

public class SumTwoNumbers {

    public int[] solution(int[] numbers) {

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        int[] array = set.stream()
                .mapToInt(Integer::intValue)
                .sorted()
                .toArray();
        return array;
    }

    public static void main(String[] args) {
        SumTwoNumbers sumTwoNumbers = new SumTwoNumbers();
        int[] numbers1 = {2,1,3,4,1};
        int[] solution = sumTwoNumbers.solution(numbers1);
        System.out.println("solution = " + Arrays.toString(solution));
        int[] numbers2 = {5, 0, 2, 7};
        int[] solution2 = sumTwoNumbers.solution(numbers2);
        System.out.println("solution2 = " + Arrays.toString(solution2));
    }

}
