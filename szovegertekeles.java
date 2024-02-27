import java.util.Scanner;

public class szovegertekeles {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  
     System.out.println("kérek egy jegyet: ");   
     int myint1 =sc.nextInt();
        switch (myint1)
        {
            case 1:
            System.out.println("elégetelen");
            break;
            case 2:
            System.out.println("elégséges");
            break;
            case 3:
            System.out.println("közepes");
            break;
            case 4:
            System.out.println("jó");
            break;
            case 5:
            System.out.println("jeles");
            break;
            default:
            System.out.println("nincs ilyen jegy");
        }
    
    
    }
}
