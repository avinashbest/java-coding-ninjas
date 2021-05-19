package ojectOrientedProgramming1.FractionClass;

public class FractionUse {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(4, 6);
        Fraction f2 = new Fraction(4, 8);
        f1.print();
        f2.print();

        f1.setNumerator(20);
        System.out.println(f1.getNumerator());

        f1.increment();

        f1.add(f2);
        f1.print();

        f1.subtract(f2);
        f1.print();

        f1.multiply(f2);
        f1.print();

        Fraction f3 = Fraction.add(f1, f2);
        f3.print();
    }
}
