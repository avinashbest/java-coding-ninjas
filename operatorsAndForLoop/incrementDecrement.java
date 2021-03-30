package operatorsAndForLoop;

public class incrementDecrement {
    public static void main(String[] args) {
        int a = 60, b = 80;
//        short circuiting -> b++ will not be executed by the compiler
        if (a++ > 60 && b++ > 80) {
            System.out.println("Inside if");
        } else {
            System.out.println("Inside else");
        }
        System.out.println("a " + a + " b " + b);
//        short circuiting -> b++ will not be executed by the compiler
        if (a++ > 60 || b++ > 80) {
            System.out.println("Inside if");
        } else {
            System.out.println("Inside else");
        }
        System.out.println("a " + a + " b " + b);

/*
        int a = 60;
        a = a + 1;
        int b = a++;
        System.out.println(a);
        System.out.println(b);
*/
    }
}
