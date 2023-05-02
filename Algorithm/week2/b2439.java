package Algorithm.week2;

import java.util.Scanner;

public class b2439 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        for (int i = 1; i < a + 1; i++) {
            System.out.println(" ".repeat(a-i)+"*".repeat(i));
        }

        input.close();
    }
}
