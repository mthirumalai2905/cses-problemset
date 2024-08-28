import java.util.*;

public class EqualSumSets {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        long totalSum = (long) n * (n + 1) / 2;
        
        if (totalSum % 2 != 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            long halfSum = totalSum / 2;
            List<Integer> set1 = new ArrayList<>();
            List<Integer> set2 = new ArrayList<>();
            
            for (int i = n; i > 0; i--) {
                if (halfSum >= i) {
                    set1.add(i);
                    halfSum -= i;
                } else {
                    set2.add(i);
                }
            }
            
            StringBuilder sb = new StringBuilder();
            sb.append(set1.size()).append('\n');
            for (int num : set1) {
                sb.append(num).append(' ');
            }
            sb.append('\n');
            
            sb.append(set2.size()).append('\n');
            for (int num : set2) {
                sb.append(num).append(' ');
            }
            System.out.print(sb.toString());
        }
        
        sc.close();
    }
}
