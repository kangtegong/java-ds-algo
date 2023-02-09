import java.util.Vector;

public class List_4 {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<String>();

        vector.add("item1");
        vector.add("item2");
        vector.add("item3");

        int capacity = vector.capacity();

        System.out.println("Current capacity of Vector: " + capacity);

    }
}
