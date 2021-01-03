import java.io.*;

public class Problem11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input_String = br.readLine();
        int T = Integer.parseInt(input_String);

        for (int i=0; i<T; i++) {
            String twoInt_String = br.readLine();
            String[] twoInt = twoInt_String.split(" ");
            int a = Integer.parseInt(twoInt[0]);
            int b = Integer.parseInt(twoInt[1]);
            String str = "Case #" + (i+1) + ": " + (a+b);
            bw.write(str);
            bw.newLine();
        }
        bw.flush();
        br.close(); bw.close();
    }
}
