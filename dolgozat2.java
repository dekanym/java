import java.util.Scanner;

public class dolgozat2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("kicsit néztem a math modult interneten");

        System.out.println("kérem a kör sugarát: ");
        double radius = sc.nextDouble();

        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("területe: "+ area);

        int roundedArea = (int) Math.round(area);
        System.out.println( roundedArea);
    }
}
