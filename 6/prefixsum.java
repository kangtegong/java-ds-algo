import java.util.*;

class prefixsum {
    public static int n = 5; 
    public static int arr[] = {10, 20, 30, 40, 50};
    public static int[] S = new int[6];

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
	          S[i + 1] = sum;
        }

        int left = 3;
        int right = 4;
        System.out.println(S[right] - S[left - 1]);
  }
}
