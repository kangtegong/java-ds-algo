import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Tree tree = new Tree();
        for(int i = 0; i < N; i++){
            String[] input = br.readLine().split(" ");

            tree.createNode(input[0], input[1], input[2]);
        }

        tree.preOrder(tree.root);
        System.out.println();

        tree.inOrder(tree.root);
        System.out.println();

        tree.postOrder(tree.root);
        System.out.println();
    }
}

class Tree{
    Node root = new Node(".");

    void createNode(String mid, String left, String right){
        if(root.data.equals(".")){
            if(!mid.equals("."))
                root = new Node(mid);
            if(!left.equals("."))
                root.left = new Node(left);
            if(!right.equals("."))
                root.right = new Node(right);
        }

        else find(root, mid, left, right);
    }

    void find(Node node, String mid, String left, String right){
        if(node == null)
            return;

        else if(mid.equals(node.data)) {
            if(!left.equals("."))
                node.left = new Node(left);
            if(!right.equals("."))
                node.right = new Node(right);
        }

        find(node.left, mid, left, right);
        find(node.right, mid, left, right);
    }

    void preOrder(Node node) {
		// Complete This
    }

    void inOrder(Node node) {
		// Complete This
    }

    void postOrder(Node node) {
		// Complete This
    }
}

class Node {
    String data;
    Node left, right;

    Node(String data){
        this.data = data;
    }
}
