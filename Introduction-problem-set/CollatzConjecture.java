import java.util.Scanner;

public class CollatzConjecture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        
        while (n != 1) {
            System.out.print(n + " ");
            if (n % 2 != 0) {
                n = 3 * n + 1;
            } else {
                n /= 2;
            }
        }
        
        System.out.println(1);
        sc.close();
    }
}
