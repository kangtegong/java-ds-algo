import java.util.*;

class twopointer {
	public static int n = 5; // 데이터 개수
	public static int m = 5; // 찾고자 하는 부분 합
	public static int[] arr = {1, 2, 3, 2, 5};

	public static void main(String[] args) {
	    int cnt = 0, intvalSum = 0, end = 0;
	    // start를 차례대로 증가시키며 반복
	    for (int start = 0; start < n; start++) {
		// end를 가능한 만큼 이동시키기
	    	while (intvalSum < m && end < n) {
			intvalSum += arr[end];
			end += 1;
		}
		// 부분합이 m일때 카운트 증가
		if (intvalSum == m) {
			cnt += 1;
		}
		intvalSum -= arr[start];
	    }
	    System.out.println(cnt);
	}
}
