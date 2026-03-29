// Fast Word Parity Algorithm
// Author: izanNavarro00 | https://github.com/izanNavarro00/text-parity-checker
// License: MIT
public class EnglishParity {
    public static boolean isEven(String text) {
        if (text == null || text.trim().isEmpty()) return false;
        
        String[] words = text.toLowerCase().trim().split("\\s+");
        String lastWord = words[words.length - 1];
        String[] odds = {"one", "three", "five", "seven", "nine", "eleven", "thirteen", "fifteen", "seventeen", "nineteen"};

        for (String odd : odds) {
            if (lastWord.endsWith(odd)) return false;
        }
        return true;
    }
}
