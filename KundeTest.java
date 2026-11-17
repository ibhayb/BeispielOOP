public class KundeTest {
    public static void main(String[] args) {
        Kunde kunde1 = new Kunde("Ibrahim", "Hayber", 1);
        Kunde kunde2 = new Kunde("Ibrahim", "Hayber", 1);
        // Kunde kundeX = new Kunde("Ibrahim", "XY", 2);
        System.out.println(kunde1);
        System.out.println(kunde2);

        if (kunde1.equals(kunde2)) {
            System.out.println("Es ist derselbe Kunde.");
        } else {
            System.out.println("Es ist nicht derselbe Kunde.");
        }
    }
}
