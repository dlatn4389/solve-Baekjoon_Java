import java.util.Scanner;

public class Problem11022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        for (int i=0; i<T; i++) {
            String inputString = sc.nextLine();
            String[] inputString_splited = inputString.split(" ");
            int a = Integer.parseInt(inputString_splited[0]);
            int b = Integer.parseInt(inputString_splited[1]);
            System.out.println("Case #" + (i+1) + ": " + a + " + " + b + " = " + (a+b));
        }
    }
}
