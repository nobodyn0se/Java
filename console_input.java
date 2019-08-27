import java.io.*;

class console_input {
    String a, b;
    void getdata() {
        Console c = System.console();
        a = c.readLine();
        b = c.readLine();
    }
    void display() {
        System.out.println("First input " + (a));
        System.out.println("Second input " + (b));
    }

    public static void main(String a[]) {
        console_input o = new console_input();
        o.getdata();
        o.display();
    }
}

