package strings;

public class CheckPalindrome {

    public static boolean checkPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "abda";
        System.out.println(checkPalindrome(str));
    }
}
