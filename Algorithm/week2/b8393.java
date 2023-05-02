package Algorithm.week2;
import java.util.Scanner;

public class b8393 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int result = 0;
        for (int i = 1; i < a+1; i++) {
            result = result + i;
        }
        System.out.println(result);
        input.close();
    }    
}
