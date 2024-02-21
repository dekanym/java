import java.util.Scanner;

public class iffeladat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.println("kérek egy számot");
        int myint1 =sc.nextInt();
        System.out.println("kérek egy másik számot");
        int myint2 =sc.nextInt();
        if(myint1>myint2)
        {
            System.out.println(myint1 +" a nagyobb szám");
        }
        else
        {
            System.out.println(myint2 +" a nagyobb szám");
        }
    }
}
