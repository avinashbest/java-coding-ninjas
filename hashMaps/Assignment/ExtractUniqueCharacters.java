package hashMaps.Assignment;

import java.util.HashMap;

/*Given a string S, you need to remove all the duplicates. That means, the output string should contain each character only once. The respective order of characters should remain same, as in the input string.
Input format:
The first and only line of input contains a string, that denotes the value of S.
Output format :
The first and only line of output contains the updated string, as described in the task.
Constraints :
0 <= Length of S <= 10^8
Time Limit: 1 sec
Sample Input 1 :
ababacd
Sample Output 1 :
abcd
Sample Input 2 :
abcde
Sample Output 2 :
abcde*/
public class ExtractUniqueCharacters {

    private static String extractUniqueCharacters(String str) {
        if (str.length() == 0) return "";

        String answer = "";
        var map = new HashMap<Character, Boolean>();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (!map.containsKey(currentChar)) {
                map.put(currentChar, true);
                answer = answer + currentChar;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println("I/P : \"ababacd\" O/P: " + extractUniqueCharacters("ababacd"));
        System.out.println("I/P : \"abcde\" O/P: " + extractUniqueCharacters("abcde"));
    }
}
