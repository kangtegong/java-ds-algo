public class Fibonacci {
    public static void main(String[] args) {
        int n = 12;
        int result = fibonacci(n);
        System.out.println("피보나치 수열의 " + n + "번째 항은 " + result + "입니다.");
    }

    public static int fibonacci(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}

