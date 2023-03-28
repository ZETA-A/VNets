package Algorithm;
import java.util.Scanner;

public class b2525 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        b = b + c;
        while (true) {
            if (b >= 60) {
                b = b - 60;
                a = a + 1;
                if (a >= 24) {
                    a = a - 24;
                }
            }
            if (b < 60 && a < 24) break;
        }

        System.out.println(a + " " + b);
        input.close();
    }
}
