import java.util.Scanner;

public class faktorila {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a number: ");
     int number = sc.nextInt();
     
     int result = faktorial(number);
     System.out.println(result);
 }
    public static int faktorial(int number) {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
    return fact;
    }
}