package objectOrientedProgramming1.FractionClass;

public class Fraction {
    private int numerator;
    private int denominator;

    /*Parameterized Constructor*/
    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            System.out.println("Error! denominator can't be 0.");
            return;
        }
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    /*Method to simplify the fraction with the help of greatest common divisor*/
    private void simplify() {
        int gcd = 1;
        int smaller = Math.min(numerator, denominator);
        for (int i = 2; i <= smaller; i++) {
            if (numerator % i == 0 && denominator % i == 0) {
                gcd = i;
            }
        }
        numerator /= gcd;
        denominator /= gcd;
    }

    /*Getters*/
    public int getNumerator() {
        return this.numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }

    /*Setters*/
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        if (denominator == 0) {
            System.out.println("Error! denominator can't be 0.");
            return;
        }
        this.denominator = denominator;
    }

    public void print() {
        System.out.println(this.numerator + " / " + this.denominator);
    }

    /*Adding 1 to the fraction*/
    public void increment() {
        numerator = numerator + denominator;
        simplify();
    }

    /*Method to perform Arithmetic operation on 2 fraction*/
    public void add(Fraction f2) {
        /*first fraction is the fraction on which the function is called. The second fraction is passed as arguments.*/
        this.numerator = (this.numerator * f2.denominator) + (f2.numerator * this.denominator);
        this.denominator = this.denominator * f2.denominator;
        simplify();
    }

    /*Another version of addition operation*/
    public static Fraction add(Fraction f1, Fraction f2) {
        int newNumerator = (f1.numerator * f2.denominator) + (f2.numerator * f1.denominator);
        int newDenominator = f1.denominator * f2.denominator;
        Fraction f3 = new Fraction(newNumerator, newDenominator);
        return f3;
    }

    public void subtract(Fraction f2) {
        /*first fraction is the fraction on which the function is called. The second fraction is passed as arguments.*/
        this.numerator = (this.numerator * f2.denominator) - (f2.numerator * this.denominator);
        this.denominator = this.denominator * f2.denominator;
        simplify();
    }

    public void multiply(Fraction f2) {
        /*first fraction is the fraction on which the function is called. The second fraction is passed as arguments.*/
        this.numerator = this.numerator * f2.numerator;
        this.denominator = this.denominator * f2.denominator;
        simplify();
    }
}
