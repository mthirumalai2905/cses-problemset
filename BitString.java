import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.IOException;

public class BitString {
    public static final int MOD = 1000000007;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintStream out = System.out;
        
        int n = Integer.parseInt(reader.readLine());
        out.println(modularExponentiation(2, n, MOD));
    }
    
    public static long modularExponentiation(int base, int exponent, int mod) {
        long result = 1;
        long baseMod = base % mod;
        
        while (exponent > 0) {
            if (exponent % 2 != 0) {
                result = (result * baseMod) % mod;
            }
            baseMod = (baseMod * baseMod) % mod;
            exponent = exponent / 2;
        }
        
        return result;
    }
}
