import java.util.Scanner;

public class Problem10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        sc.nextLine();
        String inputString = sc.nextLine();
        String[] inputString_Splited = inputString.split(" ");
        for (int i=0; i<N; i++) {
            if (X>Integer.parseInt(inputString_Splited[i])) {
                System.out.print(inputString_Splited[i] + " ");
            }
        }
    }
}
