package queue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class FunctionDevelopment {

    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        return answer;
    }

    public static void main(String[] args) {
        FunctionDevelopment functionDevelopment = new FunctionDevelopment();
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        int[] solution = functionDevelopment.solution(progresses, speeds);
        System.out.println("solution = " + Arrays.toString(solution));
        Deque<Integer> deque = new ArrayDeque<>();
        for (int progress : progresses){
            deque.offer(progress);
        }
        for (int i = 0; i <= deque.size(); i++){
            System.out.println("deque.poll() = " + deque.poll());
        }

    }

}
