package binarysearch;

public class EntryService {

    private boolean isValid(long t, int n, int[] times){
        long c = 0;
        for (int time : times) {
            c += t / time;
        }
        return c >= n;
    }

    public long solution(int n, int[] times) {
        long start = 1;
        long end = 1000000000000000000L;

        while(end > start){
            long t = (start + end) / 2;

            if (isValid(t, n, times)){
                end = t;
            } else {
                start = t + 1;
            }

        }

        return start;
    }

    public static void main(String[] args) {
        int n = 6;
        int[] times = {7, 10};
        EntryService entryService = new EntryService();
        long solution = entryService.solution(n, times);
        System.out.println("solution = " + solution);
    }

}
