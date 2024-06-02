package string;

public class ReverseThirdLaw {

    public int solution(int n) {
        String str = Integer.toString(n, 3);
        String reversed = new StringBuilder(str).reverse().toString();
        return Integer.valueOf(reversed, 3);
    }

    public static void main(String[] args) {
        ReverseThirdLaw thirdLaw = new ReverseThirdLaw();
        int solution = thirdLaw.solution(45);
        System.out.println(solution);
    }

}
