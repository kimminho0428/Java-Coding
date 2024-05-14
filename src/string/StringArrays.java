package string;

public class StringArrays {
    public static void main(String[] args) {
        String str1 = new String("ABC");
        System.out.println("str1 = " + str1);
        char[] charArray = str1.toCharArray();
        for (char c : charArray) {
            System.out.println("c = " + c);
        }
        char c = str1.charAt(2);
        System.out.println("c = " + c);
    }

}
