package sort;

import java.util.Arrays;

public class HIndex {

    private boolean isValid(int[] citations, int h){
        int index = citations.length - h;
        return citations[index] >= h;
    }

    public int solution(int[] citations) {
        Arrays.sort(citations);
        for (int h = citations.length; h >= 1; h--) {
            if (isValid(citations, h)) return h;
        }
        return 0;
    }

    public static void main(String[] args) {
        HIndex hIndex = new HIndex();
        int[] citations = {3, 0, 6, 1, 5};
        int solution = hIndex.solution(citations);
        System.out.println("solution = " + solution);
    }

}
