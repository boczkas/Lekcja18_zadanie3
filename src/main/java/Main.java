import restauracja.Restauracja;

public class Main {
//    Na konsoli powinno pojawić się:
//      "Calkowity dochod restauracji:"
//      2700.0
//      Dochod Sabiny:
//      300.0
//      Dochod Katarzyny:
//      1000.0
//      Dochod Antoniny:
//      1200.0
//      Dochod Haliny:
//      200.0
    public static void main(String[] args) {
        Restauracja restauracja = new Restauracja();

        System.out.println("Calkowity dochod restauracji:");
        System.out.println(restauracja.pobierzCalkowityDochod());

        System.out.println("Dochod Sabiny:");
        System.out.println(restauracja.pobierzDochodKelnerki("Sabina"));

        System.out.println("Dochod Katarzyny:");
        System.out.println(restauracja.pobierzDochodKelnerki("Katarzyna"));

        System.out.println("Dochod Antoniny:");
        System.out.println(restauracja.pobierzDochodKelnerki("Antonina"));

        System.out.println("Dochod Haliny:");
        System.out.println(restauracja.pobierzDochodKelnerki("Halina"));
    }
}
