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
        for (i = lo + 1; i < hi; i++) {
            for (j = 2; j < i; j++) {
                if (i % j == 0)
                    break;
            }
            if (i == j)
                System.out.printf("%d ", i);
        }
    }

    public static void main(String a[]) {
        prime p = new prime();
        p.get();
        p.pcalc();
    }
}
