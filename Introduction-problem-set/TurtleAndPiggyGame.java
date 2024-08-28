import java.util.Scanner;

public class TurtleAndPiggyGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            
            int result = a[0];
            boolean turtleTurn = true;
            
            for (int i = 1; i < n; i++) {
                if (turtleTurn) {
                    result = Math.max(result, a[i]);
                } else {
                    result = Math.min(result, a[i]);
                }
                turtleTurn = !turtleTurn;
            }
            
            System.out.println(result);
        }
        
        scanner.close();
    }
}
