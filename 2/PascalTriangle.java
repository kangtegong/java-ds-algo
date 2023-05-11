import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static List<Integer> pascalTriangle(int n) {
        List<Integer> row = new ArrayList<>();
        if (n == 1) {
            row.add(1);
            return row;
        } else {
            row.add(1);
            List<Integer> previousRow = pascalTriangle(n-1);
            for (int i = 0; i < previousRow.size() - 1; i++) {
                row.add(previousRow.get(i) + previousRow.get(i+1));
            }
            row.add(1);
        }
        return row;
    }

    public static void main(String[] args) {
        System.out.println(pascalTriangle(8));
    }
}
