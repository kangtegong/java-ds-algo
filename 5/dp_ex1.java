import java.io.*;

// 24416
public class Main {	
	public static int fibonacci(int n) {
		int[] fibos = new int[n+1];
		fibos[1]=fibos[2]=1;
		for(int i=3;i<=n;i++) {
			fibos[i]=fibos[i-1]+fibos[i-2];
		}
		return fibos[n];
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		bw.append(fibonacci(n)+" "+(n-2));
		bw.close();
		br.close();
	}
}
