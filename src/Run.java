public class Run {
    public static void main(String[] args) {
        Box box = new Box<>();


        box.setItem("aaaa");
        box.setItem(1);
        System.out.println(box.getItem());


        Pair<String, Float> pair = new Pair<String, Float>();
        pair.setKey("");
    }
}
