package Algorithm;

import java.util.Scanner;

public class b2884 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int h = input.nextInt();
        int m = input.nextInt();

        h--;
        m = m + 15;
        if (m >= 60) {
            h++;
            m = m - 60;
        }
        if (h >= 24) {
            h = 0;
        } else if (h < 0) {
            h = 24 + h;
        }

        System.out.println(h + " " + m);
        input.close();
    }
}
