package strings;

public class ReverseEachWord {
    public static String reverseEachWord(String str) {
        String answer = "";
        int currentWordStart = 0;
        int i = 0;
        for (; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
//                Reverse Current Word
                int currentWordEnd = i - 1;
                String reversedWord = "";
                for (int j = currentWordStart; j <= currentWordEnd; j++) {
                    reversedWord = str.charAt(j) + reversedWord;
                }
//                Add it final string(answer)
                answer += reversedWord + " ";
                currentWordStart = currentWordStart + i + 1;
            }
        }
//        for the last word there is no space
        int currentWordEnd = i - 1;
        String reversedWord = "";
        for (int j = currentWordStart; j <= currentWordEnd; j++) {
            reversedWord = str.charAt(j) + reversedWord;
        }
//        Add it final string(answer)
        answer += reversedWord + " ";
//        returning the reversed each word which is stored in the answer
        return answer;
    }

    public static void main(String[] args) {
        String str = "abc def ghi";
        System.out.println(reverseEachWord(str));
    }
}
