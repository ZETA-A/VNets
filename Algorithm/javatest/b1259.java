import java.util.Scanner;

public class b1259 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String r = "yes";
            String input = sc.nextLine();
            if (input.equals("0")) break;
            int il = input.length();
            for (int i = 0; i < il / 2; i++) {
                if (input.charAt((il - i - 1)) != input.charAt(i)) r = "no";
            }
            System.out.println(r);
        }
        sc.close();
    }
}