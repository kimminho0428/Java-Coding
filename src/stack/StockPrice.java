package stack;

import java.util.Arrays;
import java.util.Stack;

public class StockPrice {

    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < prices.length; i++) {
            while(!stack.isEmpty() && prices[stack.peek()] > prices[i]){
                int index = stack.pop();
                answer[index] = i - index;
            }

            stack.push(i);

            /**
             * 다른 정답
             */
//            int[] answer = new int[prices.length;];
//            for (int i = 0; i < prices.length;; i++) {
//                for (int j = i + 1; j < prices.length;; j++) {
//                    answer[i]++;
//                    if (prices[i] > prices[j])
//                        break;
//                }
//            }
//            return answer;
        }

        while(!stack.isEmpty()){
            int index = stack.pop();
            answer[index] = prices.length - index - 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 2, 3};
        StockPrice stockPrice = new StockPrice();
        int[] solution = stockPrice.solution(prices);
        System.out.println("solution = " + Arrays.toString(solution));

    }

}
