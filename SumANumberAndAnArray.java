import java.util.Scanner;

public class SumANumberAndAnArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérek egy egész számot:");
        int myint1 = sc.nextInt();
        System.out.println("Kérek egy tizedes számot:");
        double myDouble = sc.nextDouble();

        int[] intArray = {1, 2, 3}; 
        double[] doubleArray = {1.5, 2.5, 3.5}; 

        System.out.println("intNumber + intArray sum: " + sum(myint1, intArray));
        System.out.println("intNumber + doubleArray sum: " + sum(myint1, doubleArray));
        System.out.println("doubleNumber + intArray sum: " + sum(myDouble, intArray));
        System.out.println("doubleNumber + doubleArray sum: " + sum(myDouble, doubleArray));
    }

    public static int sum(int number, int[] array) {
        int arraySum = 0;
        for (int num : array) {
            arraySum += num;
        }
        return number + arraySum;
    }

    public static double sum(int number, double[] array) {
        double arraySum = 0;
        for (double num : array) {
            arraySum += num;
        }
        return number + arraySum;
    }

    public static double sum(double number, int[] array) {
        int arraySum = 0;
        for (int num : array) {
            arraySum += num;
        }
        return number + arraySum;
    }

    public static double sum(double number, double[] array) {
        double arraySum = 0;
        for (double num : array) {
            arraySum += num;
        }
        return number + arraySum;
    }
}
