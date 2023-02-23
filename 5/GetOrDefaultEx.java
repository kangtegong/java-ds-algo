import java.util.HashMap;

public class GetOrDefaultEx {
	public static void main(String arg[]) {
		String [] alphabet = { "A", "B", "C" ,"A"};
		HashMap<String, Integer> hm = new HashMap<>();
		for(String key : alphabet) hm.put(key, hm.getOrDefault(key, 0) + 1);
		System.out.println("결과 : " + hm);
        	// 결과 : {A=2, B=1, C=1}
	}
}
