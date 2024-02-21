import java.util.Scanner;

public class IFfeladat2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.println("kérek egy méretet");
        int meret =sc.nextInt();
        if(meret> 195)
        {
            System.out.println("nincs ekkora méret fatty");
        }

        else if(meret< 196 && meret>185)
        {
            System.out.println("XL méretű");
        }
        else if(meret< 186 && meret>175)
        {
            System.out.println("L méretű");
        }
        else if(meret< 176 && meret>165)
        {
            System.out.println("M méretű");
        }
        else if(meret< 166 && meret>150)
        {
            System.out.println("S méretű");
        }
        else if(meret< 150)
        {
            System.out.println("kicsi a méret");
        }
    }
}
