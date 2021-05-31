package exceptionHandling;

public class ExceptionHandling {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            divide(a, b);
            System.out.println("Within Try");
        } catch (DivideByZeroException e) {
            System.out.println("Divide by 0 Exception raised");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Generic Exception");
        } finally {
            System.out.println("Finally");
        }
        System.out.println("main() continues");
    }

    private static int divide(int a, int b) throws DivideByZeroException {
        if (b == 0) {
            throw new DivideByZeroException();
        }
        return a / b;
    }
}
