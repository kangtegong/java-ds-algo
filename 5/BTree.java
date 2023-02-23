import java.io.BufferedReader;
import java.io.InputStreamReader;

// 5639
public class Main {
	static int[] tree = new int[10000];
	static void postOrder(int start, int end) {
		int i;
		if (start >= end) {
			return;
		}
		for (i = start+1; i < end; i++) {
			if(tree[start] < tree[i] )break;
		}
		postOrder(start+1, i);
		postOrder(i, end);
		System.out.println(tree[start]);
		return ;
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = 0;
		String input;
		// 입력받기
		while((input = br.readLine()) != null) tree[i++] = Integer.parseInt(input);
		
		// 후위순회 호출
		postOrder(0, i);
	}	
}
