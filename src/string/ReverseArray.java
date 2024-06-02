package string;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public int[] solution(long n) {

        String str = String.valueOf(n);
        StringBuilder sb = new StringBuilder(str);
        sb = sb.reverse();
        String[] split = sb.toString().split("");
        int[] answer = new int[split.length];
        for(int i=0; i<split.length; i++){
            answer[i] = Integer.parseInt(split[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        ReverseArray ra = new ReverseArray();
        System.out.println(Arrays.toString(ra.solution(12345)));
    }




}
