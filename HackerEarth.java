
public class HackerEarth {

    //    function to check whether a number is prime or not
    public static boolean checkPrime(int n) {
        int divisor = 2;
        while (divisor <= Math.sqrt(n)) {
            if (n % divisor == 0) {
                return false;
            }
            divisor += 1;
        }
        return true;
    }

    public static int function(int z) {
        int sumValue = 1;
        if (z == 1) {
            return 0;
        } else if (checkPrime(z)) {
            return 1;
        }
        for (int x = 2; x <= z; x++) {
            if (checkPrime(x)) {
                int y = z / x;
                if (x <= y) {
                    sumValue = y * function(x) + x * function(y);
                }
            }
        }
        return sumValue;
    }

    public static long strangeFunction(int L, int R) {
        long sumOfDivisor = 0;
        for (int z = L; z <= R; z++) {
            //Calculate divisor of all the numbers b/w L and R
            if (998244353 % z == 0) {
                sumOfDivisor += function(z);
            }
        }
        return sumOfDivisor;
    }

    public static void main(String[] args) {
        long res = strangeFunction(1, 6);
        System.out.println(res);
    }
}
