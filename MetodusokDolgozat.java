import java.util.Scanner;

public class MetodusokDolgozat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adj meg egy számot");
        int a = scanner.nextInt();
        int sign = signOfTheNumber(a);
        System.out.println(sign);
        
        System.out.println("Adj meg egy számot vagy szöveget: ");
        Object b = scanner.next();
        System.out.println("Adj meg egy másik számot vagy szöveget: ");
        Object c = scanner.next();
        String params = twoParameters(b, c);
        System.out.println(params);
        
        System.out.println("Adj meg egy oldalt a háromszögnek:");
        double d = scanner.nextDouble();
        System.out.println("Adj meg egy másik oldalt: ");
        double e = scanner.nextDouble();
        System.out.println("Ad meg az utolsót:");
        double f = scanner.nextDouble();
        double area = triangleArea(d, e, f);
        System.out.println(area);
        
        scanner.close();
    }

    public static int signOfTheNumber(int a) {
        if (a > 0) 
        {
            return 1;
        }
        else if (a == 0) 
        {
            return 0;
        }
        else
        {
            return -1;
        }
    }    

    public static String twoParameters(Object firstParam, Object secondParam) {
        
        String firstParamAsString = String.valueOf(firstParam);
        String secondParamAsString = String.valueOf(secondParam);


        return "first parameter: " + firstParamAsString + ", second parameter: " + secondParamAsString;
    }

 public static double triangleArea(double a, double b, double c) {
    if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a) {
        return -1; 
    }  
    double s = (a + b + c) / 2; 
    double area = Math.sqrt(s * (s - a) * (s - b) * (s - c)); 

    return area;
}
}