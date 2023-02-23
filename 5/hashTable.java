import java.util.LinkedList;

public class hashTable {
	class Node{
		String key;
		String value;
		public Node(String key, String value) {
			this.key = key;
			this.value = value;
		}
		String value() {
			return value;
		}
		void value(String value) {
			this.value = value;
		}
	}

	// Node형 연결리스트로 선언
	LinkedList<Node>[] data;

	// 자신을 호출하면서 크기를 지정하여 선언
	public hashTable(int size) {
		this.data = new LinkedList[size];
	}

	// Key값을 통해 HashCode 생성 - 아스키코드이용
	int gethashCode(String key) {
		int hashcode=0;
		for(char c : key.toCharArray())
			hashcode+=c;
		return hashcode;
	}

	// HashCode를 이용해서 Index를 지정
	int convertToIndex(int hashcode) {
		return hashcode%data.length;
	}

	Node searchKey(LinkedList<Node> list, String key) {
		if(list == null ) return null;
		for(Node node : list) {
			if(node.key.equals(key)) {
				return node;
			}
		}
		return null;
	}

	// Key를 통한 값 저장
	void set(String key,String value) {
		int index = convertToIndex(gethashCode(key));
		LinkedList<Node> list = data[index];
		// 없으면 저장
		if(list == null) {
			list = new LinkedList<Node>();
			data[index] = list;
		}

		Node node = searchKey(list, key);

		if(node==null)
			list.addLast(new Node(key,value));
		else
			node.value(value);

		System.out.println("hashcode : "+gethashCode(key)+", index : " +index + ", ");
	}

	// key를 통한 값 호출
	String get(String key) {
		int index = convertToIndex(gethashCode(key));
		LinkedList<Node> list = data[index];
		if(list == null)
			return "Not Found";
		else {
			for(Node n : list) {
				if(n.key.equals(key))
					return n.value;
			}
		return null;
		}
	}

	public static void main(String[] args) {

	}

}
