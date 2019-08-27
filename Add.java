import java.util.Scanner;
class first {
    int a,b,c;
    void getdata() {
        System.out.println("Enter two numbers busdi : ");
        Scanner p = new Scanner(System.in);
        a = p.nextInt();
        b = p.nextInt();
    }
    void sum() {
        c = a + b;
        System.out.println("The addition output is: " + (c));
    }
}
class Add {
    public static void main(String args[]) {
        first obj = new first();
        obj.getdata();
        obj.sum();
    }
}
