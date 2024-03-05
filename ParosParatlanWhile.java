import java.util.Scanner;

public class ParosParatlanWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  

        int count = 1;

        while (count >0)
        {
            System.out.println("kérek egy egész számot");
            count =sc.nextInt();
            if(count<0)
            {
                System.out.println();
            }
            else if (count%2==0)
            {
                System.out.println("A szám páros");
            }
            else
            {
                System.out.println("A szám páratlan");
            }
        }
    }
}
