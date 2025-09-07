package Constructor;
import java.util.Scanner;
class Complex {
    private int real;
    private int imag;
    public Complex(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }
    public Complex add(Complex c) {
        return new Complex(this.real + c.real, this.imag + c.imag);
    }
    public Complex subtract(Complex c) {
        return new Complex(this.real - c.real, this.imag - c.imag);
    }
    public Complex multiply(Complex c) {
        int r = (this.real * c.real) - (this.imag * c.imag);
        int i = (this.real * c.imag) + (this.imag * c.real);
        return new Complex(r, i);
    }
    public void display() {
        if (imag >= 0) {
            System.out.println(real + " + " + imag + "i");
        } else {
            System.out.println(real + " - " + (-imag) + "i");
        }
    }
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter the  first real and imaginary number");
        Complex c1 = new Complex(sc.nextInt(),sc.nextInt());
        System.out.println("enter the  second real and imaginary number");
        Complex c2 = new Complex(sc.nextInt(),sc.nextInt());
        Complex sum = c1.add(c2);
        Complex diff = c1.subtract(c2);
        Complex prod = c1.multiply(c2);
        System.out.print("c1 = "); c1.display();
        System.out.print("c2 = "); c2.display();
        System.out.print("Sum = "); sum.display();
        System.out.print("Difference = "); diff.display();
        System.out.print("Product = "); prod.display();
    }
}

