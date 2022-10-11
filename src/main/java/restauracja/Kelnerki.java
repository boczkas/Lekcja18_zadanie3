package restauracja;

import java.util.List;

public class Kelnerki {
    public static List<Kelnerka> getKelnerki() {
        return List.of(new Kelnerka("Sabina"),
                new Kelnerka("Katarzyna"),
                new Kelnerka("Antonina"),
                new Kelnerka("Halina"));
    }
}
