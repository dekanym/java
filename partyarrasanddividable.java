import java.util.Scanner;


public class partyarrasanddividable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hány lány van: ");
        int girls = sc.nextInt();
        System.out.println("mennyi sausage: ");
        int boys = sc.nextInt();
        System.out.println("kérek egy számot ");
        int num = sc.nextInt();
        System.out.println("kérek még egyet: ");
        int fizz = sc.nextInt();
        System.out.println("kérek másik számot: ");
        int buzz = sc.nextInt();

        partyValidation(boys, girls);
        dividable(num, fizz, buzz);


        }
        static String partyValidation (int boys, int girls){ {
        if (boys + girls>20 && boys ==girls) {
            return("The party is excellent!");
        } else if (boys + girls>20 && boys !=girls) {
            return("Quite cool party!");
        }
        else if (boys + girls > 20) {
            return("Average party...");
        }
        else if (girls == 0) {
            return"Sausage party";
        }
        else{return "";}}
    }
        static String dividable (int num, int fizz, int buzz){ {
        if(num % fizz == 0 && num % buzz == 0){
            return "fizzbuzz";
        }
        else if(num % fizz == 0 && num % buzz != 0){
            return "fizz";
        }
        else if(num % buzz == 0 && num % fizz != 0){
            return "buzz";
        }
        else{
           return String.valueOf(num); // Convert num to string
        }
    }
        
        
    }
}
