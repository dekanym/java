import java.util.Scanner;

public class MetodusokGyakorlas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Kérek egy double-t: ");
        double mydouble = sc.nextDouble();
        String szogElnevezesResult = szogElnevezes(mydouble);
        System.out.println(szogElnevezesResult);

        System.out.println("Kérek egy számot: ");
        int myint = sc.nextInt();
        boolean hasEightTheSqrtResult = hasEightTheSqrt(myint);
        System.out.println(hasEightTheSqrtResult);

        System.out.println("Kérek egy jelszavat: ");
        String myString = sc.next();
        boolean isValidPasswordResult = isValidPassword(myString);
        System.out.println(isValidPasswordResult);
    }

    public static String szogElnevezes(double szam) {
        if (szam == 0) {
            return ("null szög");
        } else if (szam < 0) {
            return "negatin szög";
        } else if (szam > 0 && szam < 90) {
            return "hegyesszög";
        } else if (szam == 90) {
            return "derék szög";
        } else if (szam > 90 && szam < 180) {
            return "tompa szög";
        } else if (szam == 180) {
            return "egyenes szög";
        } else if (szam > 180 && szam < 360) {
            return "homorú szög";
        } else if (szam == 360) {
            return "teljes szög";
        } else {
            return "nem szög";
        }
    }

    public static boolean hasEightTheSqrt(int number) {
        double squareRoot = Math.sqrt(number);
        String squareRootStr = Double.toString(squareRoot);
        return squareRootStr.contains("8");
    }

    public static boolean isValidPassword(String password) {
        int lowercaseCount = 0;
        int uppercaseCount = 0;
        int digitCount = 0;
        int specialCharCount = 0;

        for (char ch : password.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                lowercaseCount++;
            } else if (Character.isUpperCase(ch)) {
                uppercaseCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            } else if (password.contains(".-*#@!")) {
                specialCharCount++;
            }
        }

        return lowercaseCount >= 2 && uppercaseCount >= 2 && digitCount >= 1 && specialCharCount >= 1;
    }

}
