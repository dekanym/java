import java.util.Scanner;

public class fibi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Adj meg egy pozitív számot: ");
        int n = scanner.nextInt();
        scanner.close();
        int result = fibinaci(n);
        System.out.println(result);
    }

    public static int fibinaci(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0;
        int b = 1;
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return sum;
    }
}