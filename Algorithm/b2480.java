package Algorithm;
import java.util.Scanner;

public class b2480 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if (a == b && b == c) {
            System.out.println(10000 + (a  * 1000));
        } else if (a == b || a == c || b == c) {
            if (a == b) {
                System.out.println(1000 + (a * 100));
            } else if (b == c) {
                System.out.println(1000 + (b * 100));
            } else if (c == a) {
                System.out.println(1000 + (c * 100));
            }
        } else {
            if (a > b && a > c) {
                System.out.println(a * 100);
            } else if(b > c && b > a) {
                System.out.println(b * 100);
            } else {
                System.out.println(c * 100);
            }
        }
        input.close();
    }
}
