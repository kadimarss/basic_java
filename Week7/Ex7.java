package Week7;

public class Ex7 {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        dictionary.add("cembalo", "harpsichord");
        System.out.println(dictionary.amountOfWords());

        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("porkkana"));
        dictionary.add("cembalo", "harpsichord");
        System.out.println(dictionary.amountOfWords());
    }
}