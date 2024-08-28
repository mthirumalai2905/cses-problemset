import java.util.Scanner;

public class Turtle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        
        while(testCases-->0){
            int n = scanner.nextInt();
            String s = scanner.next();

            if(s.length() < 2){
                System.out.println("No");
            }

            if(s.charAt(0) == s.charAt(n-1)){
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
        
        scanner.close();
    }
}
