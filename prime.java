import java.util.*;
class prime {
    int lo, hi, i, j, flag;
    void get() {
        System.out.println("Enter the lower and upper bounds");
        Scanner sc = new Scanner(System.in);
        lo = sc.nextInt();
        hi = sc.nextInt();
    }
    void pcalc() {
        for(i=lo; i<=hi; i++) {
            flag = 0;
            for(j=2; j<=i/2; j++) {
                if(i % j == 0) {
                    flag++;
                    break;
                }
            }
            if(flag == 0 && i != 1) System.out.printf("%d ", i);
        }
    }
    public static void main(String a[]) {
        prime p = new prime();
        p.get();
        p.pcalc();
    }
}
