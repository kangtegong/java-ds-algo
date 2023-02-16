import java.util.Scanner;
import java.util.Arrays;
 
// 11399
public class Main {
 
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
		
		Arrays.sort(arr);
 
		int prev = 0;	
		int sum = 0;	
				
		for(int i = 0; i < N; i++) {	
			sum += prev + arr[i];
			prev += arr[i];
		}
		System.out.println(sum);
	}
}
