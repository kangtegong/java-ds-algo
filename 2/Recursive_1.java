public class Recursive_1 {
    public static void main(String[] args) {
        recursion(1);
    }
    
    public static void recursion(int n) {
        if (n < 5) {
            System.out.println(n);
            recursion(n + 1);
        }
    }
}

