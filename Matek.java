public class Matek {
    public static void main(String[] args) {
        int elso = (int)(Math.random() * 200+1);
        int masodik = (int)(Math.random() * 200+1);
        System.out.println("kettő szám: ");
        System.out.println(elso);
        System.out.println(masodik);
        System.out.println("nagyobb szám: "+Math.max(elso, masodik));
        System.out.println("kisebb szám: "+Math.min(elso, masodik));
        System.out.println("1. szám négyzet gyöke: "+Math.sqrt(elso)+"2. szám négyzet gyöke: "+Math.sqrt(masodik));
        System.out.println("kér szám között a künlöbség: "+Math.abs(elso-masodik));
        System.out.println("1. szám köbe: "+Math.pow(elso, 3)+"2. szám köbe: "+Math.pow(masodik, 3));
        System.out.println("1. szám legközelebbri egészre kerekítve: "+Math.round(elso)+"2. szám legközelebbri egészre kerekítve: "+Math.round(masodik));
        System.out.println("1. szám hányadosának felfele kerekítése: "+Math.ceil(elso)+"2. szám hányadosának lefele kerekítése: "+Math.ceil(masodik));
        System.out.println("1. szám hányadosának felfele kerekítése: "+Math.floor(elso)+"2. szám hányadosának lefele kerekítése: "+Math.floor(masodik));
           
    }
}
