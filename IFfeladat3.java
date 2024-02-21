import java.util.Scanner;

public class IFfeladat3 {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  
        System.out.println("kérek egy számot");
        int szam =sc.nextInt();
        System.out.println("kérek még egy számot");
        int szam2 =sc.nextInt();
        System.out.println("kérek még még egy számot");
        int szam3 =sc.nextInt();

        if(szam>szam2 && szam>szam3 && szam2>szam3)
        {
            System.out.println("legnagyobb szám: "+szam);
            System.out.println("középső szám: "+szam2);
            System.out.println("legkisebb szám: "+szam3);
        }

        else if(szam>szam2 && szam>szam3 && szam2<szam3)
        {
            System.out.println("legnagyobb szám: "+szam);
            System.out.println("középső szám: "+szam3);
            System.out.println("legkisebb szám: "+szam2);
        }
        else if(szam2>szam && szam2>szam3 && szam>szam3)
        {
            System.out.println("legnagyobb szám: "+szam2);
            System.out.println("középső szám: "+szam);
            System.out.println("legkisebb szám: "+szam3);
        }
        else if(szam2>szam && szam2>szam3 && szam<szam3)
        {
            System.out.println("legnagyobb szám: "+szam2);
            System.out.println("középső szám: "+szam3);
            System.out.println("legkisebb szám: "+szam);
        }
        else if(szam3>szam && szam3>szam2 && szam>szam2)
        {
            System.out.println("legnagyobb szám: "+szam3);
            System.out.println("középső szám: "+szam);
            System.out.println("legkisebb szám: "+szam2);
        }
        else if(szam3>szam && szam3>szam2 && szam<szam2)
        {
            System.out.println("legnagyobb szám: "+szam3);
            System.out.println("középső szám: "+szam2);
            System.out.println("legkisebb szám: "+szam);
        }
 }   
}
