import java.util.Scanner;

public class Repitition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int ans = 1;
        int res = 1;
        for(int i = 1; i < s.length(); i++){
            char ch = s.charAt(i);
            char pch = s.charAt(i-1);
            if(ch == pch){
                ans++;
                res = Math.max(ans, res);
            } else {
                ans = 1;
            }
        }
        System.out.println(res);
        sc.close();
    }
}
