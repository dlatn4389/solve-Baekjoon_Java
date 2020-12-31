import java.util.Scanner;

public class Problem1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String two_integer = sc.nextLine();
        String[] integers = two_integer.split(" ");
        int a = Integer.parseInt(integers[0]);
        int b = Integer.parseInt(integers[1]);

        if (a<b) {
            System.out.println("<");
        }
        else if (a>b) {
            System.out.println(">");
        }
        else {
            System.out.println("==");
        }
    }
}
