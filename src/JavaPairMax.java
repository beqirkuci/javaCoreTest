import java.util.ArrayList;
import java.util.List;

public class JavaPairMax {
    public static void main(String[] args) {
        Pair<Integer,String> pair = new Pair<>();
        List<Pair>  pairList = new ArrayList<>();
        pair.setKey(1);
        pair.setValue("Value-1");
        pairList.add(pair);
        pair = new Pair<>();
        pair.setKey(2);
        pair.setValue("Value-22222222222222");
        pairList.add(pair);

        pair = new Pair<>();
        pair.setKey(3);
        pair.setValue("Value-3");
        pairList.add(pair);

        pair = new Pair<>();
        pair.setKey(4);
        pair.setValue("Value-4");
        pairList.add(pair);

        pair = new Pair<>();
        pair.setKey(5);
        pair.setValue("Value-5");
        pairList.add(pair);

        pair = new Pair<>();
        pair.setKey(6);
        pair.setValue("Value-6");
        pairList.add(pair);

        pair = new Pair<>();
        pair.setKey(7);
        pair.setValue("Value-7");
        pairList.add(pair);

        pair = new Pair<>();
        pair.setKey(8);
        pair.setValue("Value-8");
        pairList.add(pair);

        pair = new Pair<>();
        pair.setKey(9);
        pair.setValue("Value-9");
        pairList.add(pair);

        pair = new Pair<>();
        pair.setKey(10);
        pair.setValue("Value-10");
        pairList.add(pair);


        int max = 0;
        Pair<Integer, String> maxObj = new Pair<>();
        for (Pair element : pairList) {
            int length = element.getValue().toString().length();
            if (length > max) {
                max = length;
                maxObj = element;

            }


        }
        System.out.println(maxObj.toString());

    }


}
