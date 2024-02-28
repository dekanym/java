import java.util.Scanner;

public class dolgozat3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("kérek egy számot 10-90 között: ");
    int number =sc.nextInt();
        if (number<10 || number>90)
        {
            System.out.println("A szám nem helyes");
        }
        if (number%3 ==0 && number%5 ==0)
        {
            System.out.println("Fizz Buzz");
        }
        else if(number%3 ==0)
        {
            System.out.println("Fizz");
        }
        else if (number%5 ==0)
        {
        System.out.println("Buzz");
        }
        else if (number%3 ==1 || number%5 ==1)
         {System.out.println(number);}

}
}
