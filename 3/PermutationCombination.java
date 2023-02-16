import java.util.ArrayList;

// https://hanyeop.tistory.com/362
public class PermutationCombination {
	static int[] arr; // 뽑을 기준 배열
	static int n; // 기준 배열 길이
	static int r; // 뽑을 갯수
	static int perCount; // 순열 갯수
	static int comCount; // 조합 갯수

	public static void main(String[] args) {
		arr = new int[] {1,2,3,4};
		n = arr.length;
		r = 2;

		permutation(new ArrayList<Integer>(), r);
		System.out.println("[순열 갯수] " + perCount);
		System.out.println("-------------------");

		combination(new ArrayList<Integer>(), 0, r);
		System.out.println("[조합 갯수] " + comCount);
		System.out.println("-------------------");

	}

	// 순열
	public static void permutation(ArrayList<Integer> list, int count) {
		// 다 뽑았을 때
		if (count == 0) {
			System.out.println(list);
			perCount++;
			return;
		}

		for(int i = 0; i < n; i++) {
			if(list.contains(arr[i])) {
				continue;
			}
			list.add(arr[i]);
			permutation(list, count - 1); // 뽑을 때 마다 count - 1
			list.remove(list.size() - 1); // 재귀 위해 마지막에 넣은 원소 제거
		}
	}

	// 조합
	public static void combination(ArrayList<Integer> list, int index, int count) {
		// 다 뽑았을 때
		if (count == 0) {
			System.out.println(list);
			comCount++;
			return;
		}

		for(int i = index; i < n; i++) {
			list.add(arr[i]);
			combination(list, i + 1,count - 1); // 뽑을 때 마다 count - 1
			list.remove(list.size() - 1); // 재귀 위해 마지막에 넣은 원소 제거
		}
	}
}
