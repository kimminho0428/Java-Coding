package recursion;

import java.util.ArrayList;
import java.util.List;

public class WordsDictionary {

    private static final char[] CHARS = "AEIOU".toCharArray();

    private List<String> generate(String word) {
        List<String> words = new ArrayList<>();
        words.add(word);

        if (word.length() == 5) return words;

        for(char c : CHARS){
            words.addAll(generate(word + c));
        }

        return words;

    }

    public int solution(String word) {
        return generate("").indexOf(word);
    }

    public static void main(String[] args) {
        WordsDictionary wordsDictionary = new WordsDictionary();
        int solution = wordsDictionary.solution("AAAAE");
        System.out.println("solution = " + solution);
    }

}
