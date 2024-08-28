import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PalindromeReorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : input.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        StringBuilder firstHalf = new StringBuilder();
        StringBuilder middleChar = new StringBuilder();
        
        int oddCount = 0;
        
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            char ch = entry.getKey();
            int count = entry.getValue();
            
            if (count % 2 != 0) {
                oddCount++;
                middleChar.append(ch);
            }
            
            if (oddCount > 1) {
                System.out.println("NO SOLUTION");
                return;
            }
            
            firstHalf.append(String.valueOf(ch).repeat(count / 2));
        }
        
        StringBuilder secondHalf = new StringBuilder(firstHalf).reverse();
        String result = firstHalf.toString() + middleChar.toString() + secondHalf.toString();
        System.out.println(result);
    }
}
