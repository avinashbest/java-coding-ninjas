package recursion2;

public class RemoveCharacterX {

    public static String removeX(String str, int startIndex) {
        if (str.isEmpty()) {
            return str;
        }
        String answer = "";
        if (str.charAt(startIndex) != 'x') {
            answer = answer + str.charAt(startIndex);
        }
        String smallAnswer = removeX(str.substring(startIndex + 1));
        return answer + smallAnswer;
    }

    public static String removeX(String str) {
        return removeX(str, 0);
    }

    public static void main(String[] args) {
        System.out.println(removeX("xyz"));
    }
}
