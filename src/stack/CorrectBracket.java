package stack;

public class CorrectBracket {

    boolean solution(String s) {
        boolean answer = false;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                count++;
            }
            if (s.charAt(i) == ')') {
                count--;
            }
            if (count < 0) {
                break;
            }
        }
        if (count == 0) {
            answer = true;
        }

        return answer;
    }

    public static void main(String[] args) {
        String s = "(())()";
        CorrectBracket correctBracket = new CorrectBracket();
        boolean solution = correctBracket.solution(s);
        System.out.println("solution = " + solution);
    }

}
