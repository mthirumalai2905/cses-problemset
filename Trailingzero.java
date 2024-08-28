import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Trailingzero {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(reader.readLine());
            reader.close();  

            int count = 0;
            for (long i = 5; n / i >= 1; i *= 5) {
                count += n / i;
            }
            System.out.println(count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
