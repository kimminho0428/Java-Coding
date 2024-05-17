package string;

public class StrangeString {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        boolean flag = true;
        for(char ch : s.toCharArray()){
            if(!Character.isAlphabetic(ch)){
                sb.append(ch);
                flag = true;
            } else{
                if(flag){
                    sb.append(Character.toUpperCase(ch));
                } else{
                    sb.append(Character.toLowerCase(ch));
                }
                flag = !flag;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        StrangeString ss = new StrangeString();
        System.out.println(ss.solution("try hello world"));

    }
}
