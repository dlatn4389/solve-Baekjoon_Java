import java.io.*;

public class Problem15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int testCaseNum = Integer.parseInt(str);

        for (int i=0; i<testCaseNum; i++) {
            String inputs = br.readLine();
            String[] inputs_Splited = inputs.split(" ");
            int a = Integer.parseInt(inputs_Splited[0]);
            int b = Integer.parseInt(inputs_Splited[1]);
            String sum = Integer.toString(a+b);
            bw.write(sum);
            bw.newLine();
        }
        bw.flush();
        br.close(); bw.close();
    }
}
