package restauracja;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Restauracja {

    Map<Kelnerka, List<Stolik>> kelnerkiZeStolikami;
    List<Kelnerka> kelnerki;

    public Restauracja() {
        this.kelnerkiZeStolikami = new HashMap<>();
        this.kelnerki = Kelnerki.getKelnerki();
        initialize();
    }

    private void initialize() {
        List<Stolik> stoliki = List.of(
                new Stolik(100, "Sabina"),
                new Stolik(100, "Sabina"),
                new Stolik(100, "Sabina"),
                new Stolik(500, "Katarzyna"),
                new Stolik(500, "Katarzyna"),
                new Stolik(200, "Antonina"),
                new Stolik(200, "Antonina"),
                new Stolik(200, "Antonina"),
                new Stolik(200, "Antonina"),
                new Stolik(200, "Antonina"),
                new Stolik(200, "Antonina"),
                new Stolik(50, "Halina"),
                new Stolik(50, "Halina"),
                new Stolik(50, "Halina"),
                new Stolik(50, "Halina")
        );

//        Przypisz stoliki do kelnerek

    }

    public double pobierzCalkowityDochod(){
        return 0;
    }

    public double pobierzDochodKelnerki(String imie) {
        return 0;
    }

}
