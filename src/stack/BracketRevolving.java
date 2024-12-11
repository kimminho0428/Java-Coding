package stack;

import java.util.Stack;

public class BracketRevolving {

    private boolean isCorrect(char[] str, int offset){
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length; i++) {
            char c = str[(offset + i) % str.length];
            switch (c) {
                case '(' -> stack.push(')');
                case '[' -> stack.push(']');
                case '{' -> stack.push('}');
                case ')', ']', '}' -> {
                    if(stack.isEmpty()) return false;
                    if (stack.pop() != c) return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public int solution(String s) {
        char[] str = s.toCharArray();

        int count = 0;
        for (int offset = 0; offset < str.length; offset++) {
            if(isCorrect(str, offset)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        BracketRevolving bracketRevolving = new BracketRevolving();
        String s = "[](){}";
        int solution = bracketRevolving.solution(s);
        System.out.println("solution = " + solution);
    }

}