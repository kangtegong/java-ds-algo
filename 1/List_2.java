import java.util.ArrayList;
import java.util.List;

public class List_2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");

        // increase the capacity of the ArrayList
        list.ensureCapacity(20);

        // trim the capacity of the ArrayList
        list.trimToSize();

        // change the element at index 2
        list.set(2, "Blueberry");

        // get the sublist from index 1 to 2
        List<String> subList = list.subList(1, 3);
        System.out.println("Sublist: " + subList);

        // get the size of the ArrayList
        int size = list.size();
        System.out.println("Size: " + size);

        // convert the ArrayList to an array
        String[] array = list.toArray(new String[list.size()]);
        for (String str : array) {
            System.out.println(str);
        }

        // find the index of the element "Cherry"
        int index = list.indexOf("Cherry");
        System.out.println("Index of Cherry: " + index);

        // add a collection of elements to the ArrayList
        ArrayList<String> newList = new ArrayList<String>();
        newList.add("Kiwi");
        newList.add("Lemon");
        list.addAll(newList);
        System.out.println("ArrayList after adding a collection: " + list);
    }
}
