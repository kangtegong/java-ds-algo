import java.util.Scanner;

public class Main {
// 12813
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] a = new int[1000001];
		int[] b = new int[1000001];
		
		String strA = sc.nextLine();
		String strB = sc.nextLine();
		for (int i = 0; i < strA.length(); i++) {
			a[i] = strA.charAt(i) - '0';
			b[i] = strB.charAt(i) - '0';
		}
		
		StringBuilder sb = new StringBuilder();
		// A&B
		for (int i = 0; i < strA.length(); i++) sb.append(a[i]&b[i]);
		sb.append("\n");
		// A|B
		for (int i = 0; i < strA.length(); i++) sb.append(a[i]|b[i]);
		sb.append("\n");
		// A^B
		for (int i = 0; i < strA.length(); i++) sb.append(a[i]^b[i]);
		sb.append("\n");
		// ~A
		for (int i = 0; i < strA.length(); i++) sb.append(a[i]^1);
		sb.append("\n");
		// ~B
		for (int i = 0; i < strA.length(); i++) sb.append(b[i]^1);
		sb.append("\n");
		
		System.out.println(sb);
		
	}

}
