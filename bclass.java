import java.io.*;
class bclass {
    public static void main(String ar[]) throws Exception{
        String a,b;
        int c;
        System.out.println("Enter two numbers");
        InputStreamReader n = new InputStreamReader(System.in);
        BufferedReader x = new BufferedReader(n);
        a = x.readLine();
        b = x.readLine();
        c = Integer.parseInt(a) + Integer.parseInt(b);
        System.out.printf("The sum of %s and %s is: %d: ", a, b, c);
        x.close();
    }
}
