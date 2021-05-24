import java.io.IOException;
import java.util.Scanner;

public class task12 {
    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();
        while (num > 0) {
            int a = num % 10;
            if (a % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            num = num/10;

        }

        System.out.println("Even: " + even + " Odd: " + odd);
        in.close();
    }
}
