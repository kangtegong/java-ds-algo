import java.io.BufferedReader;
import java.io.InputStreamReader;

// 5639
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 입력은 루트
        Node root = new Node(Integer.parseInt(br.readLine()));

        // 입력이 없을때까지 트리 생성
        String input;
        while ((input = br.readLine()) != null) {
            root.insert(Integer.parseInt(input));
        }

        // 후위 순회
        preOrder(root);

    }

    // 후위 순회 메서드
    static void preOrder(Node node) {
        if (node == null) return;
        preOrder(node.left);
        preOrder(node.right);
        System.out.println(node.num);
    }

    // 트리 클래스
    static class Node {
        int num;

        Node left, right;

        // 생성자
        Node(int num) {
            this.num = num;
        }

        // 노드 추가 메서드
        void insert(int num) {
            // 입력 num이 현재 노드보다 작다면
            if (num < this.num) {
                // 자식 노드가 없으면 새로 생성
                if (this.left == null) {
                    this.left = new Node(num);
                    // 자식 노드가 있다면 탐색후 추가
                } else {
                    this.left.insert(num);
                }
            } else {
                if (this.right == null) {
                    this.right = new Node(num);
                } else {
                    this.right.insert(num);
                }
            }
        }
    }
}
