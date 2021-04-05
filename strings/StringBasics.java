package strings;

public class StringBasics {
    public static void main(String[] args) {
        char[] arr = {'C', 'o', 'd', 'i', 'n', 'g'};
        String str1 = "Coding";
        String str2 = " is fun";
        String str3 = "Ceding";
        
        System.out.println(str1);
        /*length of the string*/
        System.out.println(str1.length());
        /*character at a particular index*/
        System.out.println(str1.charAt(4));
        
        /*Concatenating Strings*/
        str1 += str2;
        str1 = str1.concat(str2);
        /*1st string contains 2nd string*/
        System.out.println(str1.contains("ing"));
        /*Equal String or not?*/
        System.out.println(str1.equals(str3));
        /*compare string lexicographically*/
        System.out.println(str1.compareTo(str3));

        /*String Substring Function*/
        System.out.println(str1.substring(0));
        System.out.println(str1.substring(1));
        System.out.println(str1.substring(2));
        System.out.println(str1.substring(3));
        System.out.println(str1.substring(4));
        System.out.println(str1.substring(5));
        System.out.println(str1.substring(6));
    }
}
