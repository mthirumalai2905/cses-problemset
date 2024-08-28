import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n - 1];
        
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }

        long actualSum = 0;
        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }

        long requiredSum = (long) n * (n + 1) / 2;

        System.out.println(requiredSum - actualSum);
        sc.close();
    }
}
