import java.util.Scanner;

public class Problem2845 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int P = sc.nextInt();
        int personNum = L*P;
        sc.nextLine();
        for (int i=0; i<5; i++) {
            System.out.print((sc.nextInt()-personNum) + " ");
        }
    }
}
