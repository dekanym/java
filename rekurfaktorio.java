import java.util.Scanner;

public class rekurfaktorio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Adj meg egy pozitív számot: ");
        int number = scanner.nextInt();
        long result = factorial(number);
        System.out.println (result);
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}