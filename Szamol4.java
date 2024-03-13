import java.net.SocketTimeoutException;
import java.util.Scanner;

public class Szamol4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Kérek kettő számot: ");   
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        System.out.println();
        
        for (int i = 1; i <= 100; i++) {

            if(i%3==0){continue;} 

            else if(i % number1 == 0 && i % number2 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % number1 == 0) {
                System.out.println("Fizz");
            } else if (i % number2 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
