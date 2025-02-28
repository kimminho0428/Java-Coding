package hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MakeAtoB {

    public int solution(String before, String after) {
        char[] a = before.toCharArray();
        char[] b = after.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        return new String(a).equals(new String(b)) ? 1 : 0;

        /**
         * 내가 풀어낸 방법
         */
      /*  int answer = 1;
        char[] a = before.toCharArray();
        char[] b = after.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) answer = 0;
        }
        return answer;
      */

    }

    public static void main(String[] args) {
        MakeAtoB makeAtoB = new MakeAtoB();
        String before = "olleh";
        String after = "hello";
        int solution = makeAtoB.solution(before, after);
        System.out.println("solution = " + solution);

        String before2 = "allpe";
        String after2 = "apple";
        int solution1 = makeAtoB.solution(before2, after2);
        System.out.println("solution1 = " + solution1);
    }

}
