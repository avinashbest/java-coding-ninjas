package functionAndScope;

public class MoreOnFunctions {
    //    function to add 2 numbers
    public static int addition(int a, int b) {
        return (a + b);
    }

    //    function to print even numbers b/w start and end
    public static void printEvenNumber(int start, int end) {
        if (start % 2 != 0) {
            start++;
        }
        for (int i = start; i <= end; i += 2) {
            System.out.print(i + "\t");
        }
    }

    //    main function / driver code
    public static void main(String[] args) {
        printEvenNumber(3, 17);

        System.out.println();

        int sum = addition(10, 20);
        System.out.println(sum);
    }
}
