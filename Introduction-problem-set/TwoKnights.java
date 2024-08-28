import java.util.Scanner;

public class TwoKnights {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        System.out.println(0);
        for (long i = 2; i <= n; i++) {
            long totalPairs = (i * i) * (i * i - 1) / 2;
            long attackingPairs = 4 * (i - 2) * (i - 1);
            System.out.println(totalPairs - attackingPairs);
        }

        sc.close();
    }
}
