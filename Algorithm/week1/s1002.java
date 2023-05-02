import java.util.Scanner;

public class s1002 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rInput = input.nextInt();
        int gInput = input.nextInt();
        int bInput = input.nextInt();

        int boxCount = 0;
        int min = Math.min(rInput, Math.min(gInput, bInput));

        rInput = rInput - min;
        gInput = gInput - min;
        bInput = bInput - min;
        boxCount = min;

        input.close();
    }
}
