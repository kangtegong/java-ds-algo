import java.util.Scanner;
import java.util.Stack;

// 10773
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		int K = scan.nextInt();
		int sum = 0;
		
		for(int i=0; i<K; i++) {
			int num = scan.nextInt();
			if(num == 0) 		// 입력받은 수가 0일경우
				stack.pop();	// 가장 마지막에 넣은 숫자 뺌
			else 				// 입력받은 수가 0이 아닐경우
				stack.push(num);// stack에 데이터 삽입
		}
		while(!stack.isEmpty()) // stack이 빌동안 반복
			sum += stack.pop();	// 합
		
		System.out.println(sum);
		scan.close();
	}
}
