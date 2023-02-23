import java.util.Scanner;
 
public class Main {
 
	static int[][] arr;
	static Integer[][] dp;
	static int N;
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		arr = new int[N][N];
		dp = new Integer[N][N];
 
        
		// 배열 초기화
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < i + 1; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		
		// 가장 마지막 행의 값들을 DP의 마지막 행에도 똑같이 복사
		for (int i = 0; i < N; i++) {
			dp[N - 1][i] = arr[N - 1][i];
		}
		System.out.println(find(0, 0));
	}
 
	static int find(int depth, int idx) {
		// 마지막 행일 경우 현재 위치의 dp값 반환
		if(depth == N - 1) return dp[depth][idx];
 
		// 탐색하지 않았던 값일 경우 다음 행의 양쪽 값 비교
		if (dp[depth][idx] == null) {
			dp[depth][idx] = Math.max(find(depth + 1, idx), find(depth + 1, idx + 1)) + arr[depth][idx];
		}
		return dp[depth][idx];
 
	}
}
