import java.util.ArrayList;
import java.util.List;

public class FibonacciList {

    public static void main(String[] args) {
        List<Integer> fibonacciList = fibonacci(10);
        System.out.println(fibonacciList);     
    }

    public static List<Integer> fibonacci(int n) {
        List<Integer> fibonacciList = new ArrayList<>();

        if (n < 0) {
            System.out.println("Invalid input. n must be non-negative.");
            return fibonacciList;
        }

        if (n >= 1) {
            fibonacciList.add(0); 
        }
        if (n >= 2) {
            fibonacciList.add(1); 
        }

        for (int i = 2; i < n; i++) {
            int nextFibonacci = fibonacciList.get(i - 1) + fibonacciList.get(i - 2);
            fibonacciList.add(nextFibonacci);
        }

        return fibonacciList;
    }
}
