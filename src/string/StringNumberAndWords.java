package string;

import java.util.HashMap;

public class StringNumberAndWords {

    public int solution(String s) {
        String[] strArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0; i < strArr.length; i++) {
            s = s.replaceAll(strArr[i], Integer.toString(i));
        }
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        StringNumberAndWords stringNumberAndWords = new StringNumberAndWords();
        System.out.println(stringNumberAndWords.solution("one4seveneight"));

    }
}
