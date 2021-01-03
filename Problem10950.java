import java.util.Scanner;

public class Problem10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String testCaseNum_String = sc.nextLine();
        int testCaseNum = Integer.parseInt(testCaseNum_String);
        int[] results = new int[testCaseNum];

        for (int i=0; i<testCaseNum; i++) {
            String inputInts_String = sc.nextLine();
            String[] inputInts_StringSplited = inputInts_String.split(" ");
            int A = Integer.parseInt(inputInts_StringSplited[0]);
            int B = Integer.parseInt(inputInts_StringSplited[1]);
            results[i] = A+B;
        }
        for (int i=0; i<testCaseNum; i++) {
            System.out.println(results[i]);
        }
    }
}
