package Algorithm.week3;
import java.util.Scanner;

/*
 * 
 * 리스트를 사용못함
 * 
 */

public class b9506 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while (true) {
            int userInput = input.nextInt();
            int result = 0;
            for (int i = 1; i <= userInput; i++) {
                if (userInput % i == 0) {
                    int a = userInput / i;
                    result += a;
                }
            }
            result = result - userInput;
            if (userInput == result) {
                System.out.println("완전수");
            } else {
                System.out.println("아님");
            }
            if (userInput < 0) {
                break;
            }
        }
        input.close();
    }
}
