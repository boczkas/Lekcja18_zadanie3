package restauracja;

import java.util.ArrayList;
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
        for (Kelnerka kelnerka : kelnerki) {
            List<Stolik> stolikiKelnerki = new ArrayList<>();
            for (Stolik stolik : stoliki) {
                if (stolik.imieKelnerki.equals(kelnerka.imie)) {
                    stolikiKelnerki.add(stolik);
                }
            }
            this.kelnerkiZeStolikami.put(kelnerka, stolikiKelnerki);
        }
    }

    public double pobierzCalkowityDochod(){
        double calkowityDochod = 0;

        for(List<Stolik> stoliki : kelnerkiZeStolikami.values()) {
            for (Stolik stolik : stoliki) {
                calkowityDochod += stolik.cenaZamowien;
            }
        }

        return calkowityDochod;
    }

    public double pobierzDochodKelnerki(String imie) {
        double dochod = 0;

        List<Stolik> stolikiKelnerki = this.kelnerkiZeStolikami.get(new Kelnerka(imie));

        for (Stolik stolik : stolikiKelnerki) {
            dochod += stolik.cenaZamowien;
        }

        return dochod;
    }

}
