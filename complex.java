import java.util.*;
class complex {
    double r1, r2, i1, i2;
    void get() {
        System.out.println("Enter the real and imaginary parts of 1st complex number");
        Scanner sc = new Scanner(System.in);
        r1 = sc.nextDouble();
        i1 = sc.nextDouble();

        System.out.println("Enter the real and imaginary parts of 2nd complex number");
        r2 = sc.nextDouble();
        i2 = sc.nextDouble();
    }

    void calc() {
        System.out.printf("The resultant sum is : " + (r1 + r2) + " + i" + (i1 + i2));
    }

    public static void main(String a[]) {
        complex c = new complex();
        c.get();
        c.calc();
    }
}
