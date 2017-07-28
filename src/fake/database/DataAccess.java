package fake.database;

import model.Developer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Surrealistic on 15/07/2017.
 */
public class DataAccess {

    public static List<Developer> get_developers() {

        List<Developer> result = new ArrayList<>();

        result.add(new Developer("Shibuya", new BigDecimal("70000"), 33));
        result.add(new Developer("Alvin", new BigDecimal("80000"), 20));
        result.add(new Developer("Jackson", new BigDecimal("1003000"), 34));
        result.add(new Developer("Jackson", new BigDecimal("1003000"), 34));
        result.add(new Developer("Jackson", new BigDecimal("1003000"), 34));
        result.add(new Developer("Zasado", new BigDecimal("322000"), 65));
        result.add(new Developer("Codex", new BigDecimal("2310000"), 32));
        result.add(new Developer("Petereo", new BigDecimal("90000"), 54));
        result.add(new Developer("Jack", new BigDecimal("100000"), 90));
        result.add(new Developer("Maron", new BigDecimal("100000"), 77));
        result.add(new Developer("Zris", new BigDecimal("170000"), 55));

        return result;
    }

    private List<String> make_names() {
        List<String> names = new ArrayList<>();

        names.add("Shibuya");
        names.add("Alvin");
        names.add("Jackson");
        names.add("Peter");
        names.add("Lasnski");
        names.add("Martin");
        names.add("Jack");
        names.add("Shon");
        names.add("Eddie");
        names.add("Edward");
        names.add("Marcel");
        names.add("Sandra");
        names.add("Michael");

        return names;
    }
}
