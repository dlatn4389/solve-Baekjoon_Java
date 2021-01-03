import java.math.BigInteger;
import java.util.Scanner;

public class Problem1271 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        BigInteger n = new BigInteger(a);
        BigInteger m = new BigInteger(b);
        System.out.println(n.divide(m));
        System.out.println(n.remainder(m));
    }
}
