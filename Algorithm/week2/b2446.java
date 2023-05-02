package Algorithm.week2;
import java.util.Scanner;

public class b2446 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();

        for (int i = 0; i < userInput; i++) {
            System.out.println(" ".repeat(i) + "*".repeat(2 * userInput - 1 - i - i));
        }
        for (int i = 1; i < userInput; i++) {
            if (userInput <= 2) System.out.println(" ".repeat(userInput - i - 1) + "*".repeat(2 / userInput + 1 + i));
            else System.out.println(" ".repeat(userInput - i - 1) + "*".repeat(2 / userInput + 1 + i + i));
        }

        input.close();
    }
}
