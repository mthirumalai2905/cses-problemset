import java.util.Scanner;

public class ApplePartition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] weights = new long[n];
        long totalSum = 0;
        
        for (int i = 0; i < n; i++) {
            weights[i] = sc.nextLong();
            totalSum += weights[i];
        }
        
        long minDifference = Long.MAX_VALUE;
        
        int subsetCount = 1 << n;
        
        for (int mask = 0; mask < subsetCount; mask++) {
            long group1Sum = 0;
            
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    group1Sum += weights[i];
                }
            }
            
            long group2Sum = totalSum - group1Sum;
            long difference = Math.abs(group1Sum - group2Sum);
            minDifference = Math.min(minDifference, difference);
        }
        
        System.out.println(minDifference);
    }
}
