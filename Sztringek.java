import java.util.Scanner;

public class Sztringek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("kérek egy vezetéknevet: ");
        String vezeteknev = sc.next();
        System.out.println("kérek egy keresztnevet: ");
        String keresztnev = sc.next();
        System.out.println("kérek egy születési helyet: ");
        String szulhely = sc.next();
        System.out.println("kérek egy életkort: ");
        int eletkor = sc.nextInt();
        String teljesnev = vezeteknev + " " + keresztnev;
        System.out.println(teljesnev);
        System.out.println(teljesnev.toUpperCase());
        System.out.println((teljesnev + " " + szulhely).toLowerCase());
        System.out.println(teljesnev +" "+ eletkor +" éves " +szulhely +" született");;
        System.out.println(keresztnev.startsWith("A")); 
        System.out.println(vezeteknev.startsWith("t"));
        System.out.println(teljesnev.length());
        System.out.println(teljesnev.replace(teljesnev,"i"));
    }
}
