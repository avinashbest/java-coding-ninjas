package ojectOrientedProgramming1.ComplexNumber;

public class Complex {
    private int real;
    private int imaginary;

    Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void plus(Complex complex) {
        this.real = this.real + complex.real;
        this.imaginary = this.imaginary + complex.imaginary;
    }

    public void multiply(Complex complex) {
        this.real = (this.real * complex.real) - (this.imaginary * complex.imaginary);
        this.imaginary = (this.real * complex.imaginary) + (this.imaginary * complex.real);
    }

    public void print() {
        System.out.println(this.real + "\t" + this.imaginary + "i");
    }
}
