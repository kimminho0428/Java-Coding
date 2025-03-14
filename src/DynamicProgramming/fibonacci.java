package DynamicProgramming;

import java.util.Arrays;

public class fibonacci {

    private static final int[] mem = new int[100001];
    private int fibonacci(int n){
        if (mem[n] != -1) return mem[n];
        if (n == 0 || n == 1) return n;

        return mem[n] = (fibonacci(n- 1) + fibonacci(n - 2)) % 1234567;
    }

    public int solution(int n) {
        Arrays.fill(mem, -1);
        return fibonacci(n);
    }

    public static void main(String[] args) {
        int n = 3;
        fibonacci fib = new fibonacci();
        int solution = fib.solution(n);
        System.out.println("solution = " + solution);
    }

}
