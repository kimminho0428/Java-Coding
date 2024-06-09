package string;

import java.util.Arrays;

public class LoopBinary {
    public int[] solution(String s) {
        int loop = 0;
        int removed = 0;

        while(!s.equals("1")){
            int zeros = countZeros(s);
            loop += 1;
            removed += zeros;

            int ones = s.length() - zeros;
            s = Integer.toString(ones, 2);
        }

        return new int[]{loop, removed};
    }

    private int countZeros(String s) {
        int zeros = 0;
        for(char ch : s.toCharArray()){
            if(ch == '0') zeros ++;
        }
        return zeros;
    }

    public static void main(String[] args) {
        LoopBinary loopBinary = new LoopBinary();
        System.out.println(Arrays.toString(loopBinary.solution("110010101001")));
    }
}
