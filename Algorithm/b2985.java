package Algorithm;
import java.util.Scanner;

public class b2985 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if ((a + b) == c) {
            System.out.println(a + "+" + b + "=" + c);
        } else if ((a - b) == c) {
            System.out.println(a + "-" + b + "=" + c);
        } else if ((a / b) == c) {
            System.out.println(a + "/" + b + "=" + c);
        } else if ((a * b) == c) {
            System.out.println(a + "*" + b + "=" + c);
        } else if ((b + c) == a) {
            System.out.println(a + "=" + b + "+" + c);
        } else if ((b - c) == a) {
            System.out.println(a + "=" + b + "-" + c);
        } else if ((b / c) == a) {
            System.out.println(a + "=" + b + "/" + c);
        } else if ((b * c) == a) {
            System.out.println(a + "=" + b + "*" + c);
        }
        input.close();
    }
}
