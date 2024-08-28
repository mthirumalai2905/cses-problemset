import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int t = Integer.parseInt(reader.readLine().trim());
        while (t-- > 0) {
            String[] line = reader.readLine().split(" ");
            long a = Long.parseLong(line[0]);
            long b = Long.parseLong(line[1]);
            
            if (canEmptyPiles(a, b)) {
                writer.write("YES\n");
            } else {
                writer.write("NO\n");
            }
        }
        
        writer.flush();
        writer.close();
        reader.close();
    }

    private static boolean canEmptyPiles(long a, long b) {
        if ((a + b) % 3 != 0) return false;
        return a <= 2 * b && b <= 2 * a;
    }
}
