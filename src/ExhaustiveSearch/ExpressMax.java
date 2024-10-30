package ExhaustiveSearch;

import java.util.Arrays;

public class ExpressMax {

    public long solution(String expression) {

        long answer = 0;

        if (expression.equals("-") || expression.equals("+") || expression.equals("*")){
            answer += 1;
        }



        return answer;
    }

    public static void main(String[] args) {
        ExpressMax expressMax = new ExpressMax();
        long solution = expressMax.solution("100-200*300-500+20");
        System.out.println("solution = " + solution);
    }


}
