import java.io.*;

public class NumberSpiral {

    static void numberSpiral(long Y, long X, PrintWriter out) {
        if (Y > X) {
            long ans = (Y - 1) * (Y - 1);
            long add = (Y % 2 != 0) ? X : 2 * Y - X;
            out.println(ans + add);
        } else {
            long ans = (X - 1) * (X - 1);
            long add = (X % 2 == 0) ? Y : 2 * X - Y;
            out.println(ans + add);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String[] inputs = br.readLine().split(" ");
            long Y = Long.parseLong(inputs[0]);
            long X = Long.parseLong(inputs[1]);
            numberSpiral(Y, X, out);
        }

        out.flush();
    }
}
