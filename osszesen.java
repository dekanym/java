import java.util.Scanner;

public class osszesen {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("kérek egy számot: ");
        int szam = sc.nextInt();
        szamol(szam);   
    }
    public static void szamol(int szam) {
         int osszeg=0;
        for (int i = 0; i <= szam; i++) {
            osszeg += i;
            
        }
        System.out.println(osszeg);
    }
}

