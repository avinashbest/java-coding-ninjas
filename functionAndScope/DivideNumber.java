package functionAndScope;

public class DivideNumber {

    public static int integerDivide(int a, int b) {
        if (b == 0) {
            return Integer.MIN_VALUE;
        }
        return a / b;
    }

    public static void voidDivide(int a, int b) {
        if (b == 0) {
            System.out.println("error! dividing by zero.");
            return;
        }
        System.out.println("Inside Divide function");
        System.out.println(a / b);
    }

    public static void main(String[] args) {
        int a = 8;
        int b = 0;

        int res = integerDivide(a, b);
        System.out.println(res);

        voidDivide(a, b);
    }
}
