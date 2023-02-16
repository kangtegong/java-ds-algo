import java.util.Arrays;
import java.util.Scanner;

// 16435
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int snake = sc.nextInt();

		int[] arr = new int[N];
		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();

		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			if (snake >= arr[i])
				++snake;
		}
		System.out.println(snake);
	}
}
