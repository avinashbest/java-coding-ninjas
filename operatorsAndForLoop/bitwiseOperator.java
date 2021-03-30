package operatorsAndForLoop;

public class bitwiseOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;

//        bitwise AND operator
        System.out.println(a & b);
//        bitwise OR operator
        System.out.println(a | b);
//        bitwise XOR operator
        System.out.println(a ^ b);
//        bitwise NOT operator
        System.out.println(~a);
//        left shift bitwise operator
        System.out.println(10 << 1);
//        right shift bitwise operator
        System.out.println(10 >> 1);
    }
}
