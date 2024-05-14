import java.util.HashMap;

public class MapIntroduction1 {
    public static void main(String[] args) {

        // Create an empty map where the keys are integers and the values are characters
        HashMap<Integer, String> abelesz = new HashMap<>();

        // Print out whether the map is empty or not
        System.out.println(abelesz.isEmpty() ? "true" : "false");

        // Add the following key-value pairs to the map
        // 97 : a, 98 : b, 99 : c, 65 : A, 66 : B, 67 : C
        abelesz.put(97, "a");
        abelesz.put(98, "b");
        abelesz.put(99, "c");
        abelesz.put(65, "A");
        abelesz.put(66, "B");
        abelesz.put(67, "C");

        // Print all the keys
        System.out.println(abelesz.keySet());

        // Print all the values
        System.out.println(abelesz.values());

        // Add value D with the key 68
        abelesz.put(68, "D");

        // Print how many key-value pairs are in the map
        System.out.println(abelesz.size());

        // Print the value that is associated with key 99
        System.out.println(abelesz.get(99));

        // Remove the key-value pair with key 97 and print the associated value
        String removedValue = abelesz.remove(97);
        System.out.println(removedValue);

        // Print whether there is an associated value with key 100 or not
        System.out.println(abelesz.containsKey(100));

        // Remove all the key-value pairs
        abelesz.clear();

        // Print how many key-value pairs are in the map
        System.out.println(abelesz.size());
    }
}
