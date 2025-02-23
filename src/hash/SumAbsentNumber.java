package hash;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SumAbsentNumber {

    public int solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        for (int number : numbers){
            set.add(number);
        }

        int sum = 0;
        for (int i = 0; i <= 9; i++) {
            if (set.contains(i)) continue;
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        SumAbsentNumber absentNumber = new SumAbsentNumber();
        int[] numbers = {1,2,3,4,6,7,8,0};
        int solution = absentNumber.solution(numbers);
        System.out.println("solution = " + solution);
    }

}
