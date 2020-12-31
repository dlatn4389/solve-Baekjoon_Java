import java.util.Scanner;

public class Problem10430 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String two_integer = sc.nextLine();
        String[] integers = two_integer.split(" ");
        int a = Integer.parseInt(integers[0]);
        int b = Integer.parseInt(integers[1]);
        int c = Integer.parseInt(integers[2]);

        System.out.println((a+b)%c);
        System.out.println(((a%c)+(b%c))%c);
        System.out.println((a*b)%c);
        System.out.println(((a%c)*(b%c))%c);
    }
}
