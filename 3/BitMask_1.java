import java.util.Arrays;

public class BitMask_1 {
    public static void main(String[] args) {
        int[] set = {1, 2, 3};

        for (int i = 0; i < (1 << set.length); i++) {
            System.out.print("{ ");
            for (int j = 0; j < set.length; j++) {
                if ((i & (1 << j)) != 0) {
                    System.out.print(set[j] + " ");
                }
            }
            System.out.println("}");
        }
    }
}
