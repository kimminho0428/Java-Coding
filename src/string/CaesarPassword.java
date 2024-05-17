package string;

public class CaesarPassword {

    String caesar(String s, int n) {
        String result = "";
        n = n % 26;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isLowerCase(ch)){
                ch = (char)((ch - 'a' + n) % 26 + 'a');
            } else if(Character.isUpperCase(ch)){
                ch = (char)((ch - 'A' + n) % 26 + 'A');
            }
            result += ch;
        }

        return result;
    }

    public static void main(String[] args) {
        CaesarPassword caesarPassword = new CaesarPassword();
        String answer = caesarPassword.caesar("a B z", 4);
        System.out.println(answer);
    }

}
