import java.lang.invoke.CallSite;
import java.util.Scanner;

public class dolgozat4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérek egy számot 1-10 között: ");
        int number =sc.nextInt();
        
        switch(number)
        {
            case 2:System.out.println("Prímszám");
            break;
            case 3:System.out.println("Prímszám");
            break;
            case 4:System.out.println("osztható 2vel 4el");
            break;
            case 5:System.out.println("Prímszám");
            break;
            case 6:System.out.println("osztható 2vel 3mal 6al");
            break;
            case 7:System.out.println("Prímszám");
            break;
            case 8:System.out.println("osztható 2vel 4el 8al");
            break;
            case 9:System.out.println("oszható 3mal 9el");
            break;
            default:System.out.println("A szám téves");
        }
    
    }

}
