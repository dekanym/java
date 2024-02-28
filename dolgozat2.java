import java.util.Scanner;

public class dolgozat2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("kérem a kör sugarát: ");
        double radius = sc.nextDouble();

        double area = Math.PI * (radius *radius);

        System.out.println("területe: "+ area);

        int roundedArea = (int) Math.round(area);
        System.out.println( roundedArea);
    }
}
