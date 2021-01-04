import java.util.Scanner;

public class Problem552 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[5];
        for (int i=0; i<5; i++) {
            scores[i] = sc.nextInt();
            sc.nextLine();
        }
        int result = 0;
        for (int i=0; i<5; i++) {
            result += scores[i];
        }
        System.out.println(result);
    }
}
