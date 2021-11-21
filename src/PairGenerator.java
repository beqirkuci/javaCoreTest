import java.util.ArrayList;
import java.util.List;

public class PairGenerator {

    public static void main(String[] args) {

        List<Pair> pairList = new ArrayList<>();
        Pair<Integer, String> pair = new Pair<>();
        pair.setKey(1);
        pair.setValue("Value");
        pairList.add(pair);
        pair = new Pair<>();
        pair.setKey(2);
        pair.setValue("Value-2");
        pairList.add(pair);
    }



//    public static <K, V> Pair<K, V> generatePair(K key, V value) {
//        Pair<K, V> pair = new Pair<K, V>();
//        pair.setKey(key);
//        pair.setValue(value);
//        return pair;
//    }
//
//
//    public static void main(String[] args) {
//        final Pair<Integer, String> firstPair = PairGenerator.generatePair(1, "value1");
//        final Pair<Long, String> secondPair = PairGenerator.<Long, String>generatePair(2L, "value2");
//
//
//        System.out.println(firstPair);
//    }

}
