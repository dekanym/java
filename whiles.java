import java.util.Random;

public class whiles {
    public static void main(String[] args) {
        Random rand = new Random();
        int count = 0;

        while (count < 10) {
            int randomnumber1 = rand.nextInt(100) + 1;
            int randomnumber2 = rand.nextInt(100) + 1;

            int smallernumber = Math.min(randomnumber1, randomnumber2);
            int largernumber = Math.max(randomnumber1, randomnumber2);

            if (smallernumber < largernumber) {
                System.out.print(smallernumber + " ");
                count++;
            } else {
                System.out.print(largernumber + " ");
                count++;
            }
        }
    }
}
