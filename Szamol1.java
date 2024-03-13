import java.util.Scanner;

public class Szamol1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.println("kérek egy számot: ");
        int myint1 = sc.nextInt();
        System.out.println(); 
        for (int i = 0; i <= 100; i++) {
            if (i % myint1 != 0) {
                System.out.println(i);
            }
            else if (i == myint1 * 10) {
                break;}
        }
    }
}
