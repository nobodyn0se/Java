import java.util.*;

public class Palindrome {
    int n;
    int getdata() {
        System.out.println("Enter a number to test");
        //Takes user input
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        return n;
    }

    void compute(int n) {
        int copy_n = n, sum = 0;
        while(n != 0) {
            int rem = n % 10;
            sum = (sum * 10) + rem;
            n /= 10;
        }
        if(sum == copy_n)
            System.out.println("The number is palindrome");
        else
            System.out.println("The number is not palindrome");
    }
    public static void main(String a[]) {
        //Object created for the class
        Palindrome p = new Palindrome();
        int n = p.getdata();
        p.compute(n);
    }
}
