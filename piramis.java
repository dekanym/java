import java.util.Scanner;

public class piramis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("adj meg 1 számot: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        scanner.close();
    }
}