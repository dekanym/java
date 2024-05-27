import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DataStructuresDolgozat {

    private static Map<String, String> capitals = new HashMap<>();

    public static void main(String[] args) {

        // Hozz létre egy változót, mely fővárosok neveit tárolja.
        // 1 pont
        ArrayList<String> cities = new ArrayList<>();

        // Tartalmazza az alábbi adatokat: "Wien", "Budapest", "Prag", "Bratislava"
        // 2 pont
        cities.add("Wien");
        cities.add("Budapest");
        cities.add("Prag");
        cities.add("Bratislava");

        // Írasd ki a fővárosokat!
        // 1 pont
        System.out.println(cities);

        // Add hozzá a "Ljubljana", "Sarajevo" és "Zagreb" értékeket a fővásrosok listájához
        // az ujElemHozzaadasa() metódussal
        // 3 pont
        ujElemHozzaadasa(cities);

        // Írasd ki a fővárosokat!
        // 1 pont
        System.out.println(cities);

        // Töröld a fővárosok listából "Sarajevo" elemet a torolElemet() metódussal
        // 1 pont
        torolElemet(cities);

        // Írasd ki a fővárosokat!
        // 1 pont
        System.out.println(cities);

        // Hozz létre egy változót, mely főváros, ország párokat tartalmaz.
        // 1 pont

        // A tartalma a főváros, ország pároknak a következő legyen:
        // "Wien", "Österreich"
        // "Budapest", "Magyarország"
        // "Ljubljana", "Slovenija"
        // 3 pont
        capitals.put("Wien", "Österreich");
        capitals.put("Budapest", "Magyarország");
        capitals.put("Ljubljana", "Slovenija");

        // Írasd ki a főváros, ország párokat!
        // 1 pont
        kiirParok();

        // Írad ki a fovarosOrszaga() metódussal, hogy mely ország fővárosa "Budapest"
        // 1 pont
        fovarosOrszaga("Budapest");

        // Írad ki a fovarosOrszaga() metódussal, hogy mely ország fővárosa "Zagreb"
        // 1 pont
        fovarosOrszaga("Zagreb");

        // Az ujFovarosOrszagPar() metódussal add hozzá a "Zagreb", "Hrvatska" párt a fővárosok országok párokhoz
        // 1 pont
        ujFovarosOrszagPar("Zagreb", "Hrvatska");

        // A torolAdatPart() metódussal töröld a "Ljubljana" főváros ország párt
        // 1 pont
        torolAdatPart("Ljubljana");

        // A torolAdatPart() metódussal töröld a "Prag" főváros ország párt
        // kezeld a felmerülő hibát és írd ki a hibát
        // 3 pont
        torolAdatPart("Prag");

        // Írasd ki a főváros, ország párokat!
        // 1 pont
        kiirParok();
    }

    public static void ujElemHozzaadasa(ArrayList<String> cities) {
        cities.add("Ljubljana");
        cities.add("Sarajevo");
        cities.add("Zagreb");
    }

    public static void torolElemet(ArrayList<String> cities) {
        cities.remove("Sarajevo");
    }

    public static void kiirParok() {
        for (Map.Entry<String, String> entry : capitals.entrySet()) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
    }

    public static void fovarosOrszaga(String fovaros) {
        String orszag = capitals.get(fovaros);
        if (orszag != null) {
            System.out.println(fovaros + " fővárosa: " + orszag);
        } 
    }

    public static void ujFovarosOrszagPar(String fovaros, String orszag) {
        capitals.put(fovaros, orszag);
    }

    public static void torolAdatPart(String fovaros) {
        if (capitals.containsKey(fovaros)) {
            capitals.remove(fovaros);
        } 
    }

    
    /**
     * ujElemHozzaadasa() - egy elemet ad hozzá a megadott listához
     * @param list a lista, melyhez hozzá kell adni az elemet
     * @param elem az új elem
     */
    // 3 pont


    /**
     * torolElemet() - a megadott listából törli a megadott elemet
     * @param list a lista, melyből törölni kell az elemet
     * @param elem a törlendő érték
     */
    // 3 pont


    /**
     * fovarosOrszaga() - a megadott főváros, ország párok és főváros adatokra visszaadja az osztágot és a fővárost,
     * vagy visszaadja, hogy az adott főváros nincs az adatai között.
     * @param countries a főváros ország párok
     * @param capital a főváros
     * @return "country fővárosa capital", ha a párok között szerepel a főváros, egyébként
     * capital nincs az adatok között.
     * Példa:
     * England fővárosa London.
     * London nincs az adatok között.
     */
    // 3 pont


    /**
     * ujFovarosOrszagPar() - A coutries-hoz hozzáadja a főváros ország (capital country) párt.
     * @param coutries a főváros ország párok
     * @param capital a főváros neve
     * @param country az ország neve
     */
    // 3 pont


    /**
     * A coutries főváros ország adatpárok közül törli a capital főváros ország adatpárt, ha szerepel benne.
     * Ha nem szerepel benne, akkor "Nincs " + capital + " főváros az adatok között" hibát dob.
     * @param coutries a főváros ország adatpárok
     * @param capital a főváros neve
     * @throws IllegalArgumentException
     */
    // 5 pont


}
