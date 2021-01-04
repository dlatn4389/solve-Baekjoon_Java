import java.util.Scanner;

public class Problem6749 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int young = sc.nextInt();
        sc.nextLine();
        int middle = sc.nextInt();
        System.out.println(2*middle-young);
    }
}
