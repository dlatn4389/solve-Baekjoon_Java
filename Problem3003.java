import java.util.Scanner;

public class Problem3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] pieces = new int[6];
        for (int i=0; i<6; i++) {
            pieces[i] = sc.nextInt();
        }
        for (int i=0; i<6; i++) {
            if (i==0 || i==1) {
                System.out.print((1-pieces[i])+" ");
            }
            else if (i==5) {
                System.out.print((8-pieces[5])+" ");
            }
            else {
                System.out.print((2-pieces[i]) + " ");
            }
        }
    }
}
