import java.util.Scanner;
import java.util.Arrays;
 
// 2750
public class Main {
	public static void main(String[] args) {
    
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
 
		Arrays.sort(arr);
		
		for(int val : arr) {
			System.out.println(val);
		}
 
	}
}
