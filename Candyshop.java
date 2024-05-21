import java.util.*;

public class Candyshop {
    public static void main(String[] args) {
        ArrayList<Object> sweets = new ArrayList<>();
        sweets.add("Cupcake");
        sweets.add(2);
        sweets.add("Brownie");
        sweets.add(false);

        // Accidentally we added "2" and "false" to the sweets list
        // Your task is to change the "2" to "Croissant" and the "false" to "Ice cream"
        // No, don't just edit the lines above! :)
        // Create a method called "repairSweetList()" which takes the list as a parameter
        // and returns a list with the items "2" and "false" replaced (with "Croissant" and "Ice cream")

        // Expected output: [Cupcake, Croissant, Brownie, Ice cream]

        System.out.println(repairSweetList(sweets));
    }

    // Method to repair the sweets list
    public static ArrayList<Object> repairSweetList(ArrayList<Object> sweets) {
        // Find the index of the item "2" and replace it with "Croissant"
        int indexOfTwo = sweets.indexOf(2);
        if (indexOfTwo != -1) {
            sweets.set(indexOfTwo, "Croissant");
        }

        // Find the index of the item "false" and replace it with "Ice cream"
        int indexOfFalse = sweets.indexOf(false);
        if (indexOfFalse != -1) {
            sweets.set(indexOfFalse, "Ice cream");
        }

        return sweets;
    }
}