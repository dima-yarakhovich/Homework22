package Teacher;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MultiplicationTable {

    private final Set <Pair> pairs = new HashSet<>();

    public MultiplicationTable() {
        Random random = new Random();
        while (pairs.size() < 15) {
            pairs.add(new Pair(random.nextInt(10),
                    random.nextInt(10)));
        }
    }

    @Override
    public String toString() {
        return pairs.toString();
    }
}
