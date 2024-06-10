package string;

public class BasicStringHandling {
    public boolean solution(String s) {
        if(s.length() != 4 && s.length() != 6) return false;

        for(char ch : s.toCharArray()){
            if(!Character.isDigit(ch)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        BasicStringHandling basicStringHandling = new BasicStringHandling();
        System.out.println(basicStringHandling.solution("a234"));
    }

}

