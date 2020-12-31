import java.util.Scanner;

public class Problem2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line1 = sc.next();
        String line2 = sc.next();
        int mul1 = Integer.parseInt(line1);
        int num1 = Integer.parseInt(line2.substring(2,3));
        int num2 = Integer.parseInt(line2.substring(1,2));
        int num3 = Integer.parseInt(line2.substring(0,1));
        int mul2 = Integer.parseInt(line2);

        System.out.println(mul1*num1);
        System.out.println(mul1*num2);
        System.out.println(mul1*num3);
        System.out.println(mul1*mul2);
    }
}
