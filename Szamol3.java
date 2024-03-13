import java.util.Scanner;

public class Szamol3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Kérek kettő számot: ");   
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        
        for (int i = 1; i <= 100; i++) {
            if (i % number1 == 0 && i % number2 == 0) {
                System.out.println("FizzBuzz");
                break;
            } else if (i % number1 == 0) {
                System.out.println("Fizz");
            } else if (i % number2 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
