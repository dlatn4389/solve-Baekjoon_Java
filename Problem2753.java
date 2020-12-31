import java.util.Scanner;

public class Problem2753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        System.out.println(is_LeapYear(year));
    }

    static int is_LeapYear(int year) {
        if (year%4==0) {
            if (year%100==0 && year%400!=0) {
                return 0;
            }
            else {
                return 1;
            }
        }
        return 0;
    }
}
