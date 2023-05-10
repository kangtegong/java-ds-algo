public class Factorial {
    public static void main(String[] args) {
        int number = 16;
        long result = factorial(number);
        System.out.println(number + " 팩토리얼은 " + result + "입니다.");
    }

    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}

