package sort;

import java.util.Arrays;

public class NumberOfK {
    public int[] solution(int[] array, int[][] commands) {


        int[] answer = new int[commands.length];
        for (int i = 0; i < answer.length; i++){
            int[] command = commands[i];
            int from = command[0] - 1;
            System.out.println("from = " + from);
            int to = command[1];
            System.out.println("to = " + to);
            int k = command[2] - 1;
            System.out.println("k = " + k);

            int[] sub = Arrays.copyOfRange(array, from, to);
            System.out.println("sub = " + Arrays.toString(sub));
            Arrays.sort(sub);
            answer[i] = sub[k];
        }

        return answer;
    }

    public static void main(String[] args) {
        NumberOfK numberOfK = new NumberOfK();
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] solution = numberOfK.solution(array, commands);
        System.out.println("solution = " + Arrays.toString(solution));
    }
}
