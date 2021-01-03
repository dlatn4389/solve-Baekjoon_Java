import java.util.Scanner;

public class Problem2884 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String inputInts_String = sc.nextLine();
        String[] inputInts_StringSplited = inputInts_String.split(" ");
        int H, M;
        H = Integer.parseInt(inputInts_StringSplited[0]);
        M = Integer.parseInt(inputInts_StringSplited[1]);

        M -= 45;
        if (M<0) {
            M += 60;
            H -= 1;
        }
        if (H<0) {
            H = 23;
        }
        System.out.println(H + " " + M);
    }
}
