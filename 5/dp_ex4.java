import java.util.*;
 
public class Main {    
    
    static long mod = 1000000000;
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        
        long[][] dp = new long[n + 1][10];
        for(int i = 1; i <= 9; i++) {
            dp[1][i] = 1; //1자리 수의 i번째 수가 계단이 되는 경우는 한가지 밖에 없으므로 초기화.
        }
        
        for(int i = 2; i <= n; i++) {
            for(int j = 0; j < 10; j++) {
                if(j == 0) dp[i][j] = dp[i - 1][j + 1] % mod; //끝 자리가 0일때는 앞에 올 수 있는 수가 1밖에 없다.
                else if(j == 9) dp[i][j] = dp[i - 1][j - 1] % mod; //끝 자리가 9 일때는 앞에 올 수 있는 수가 8밖에 없다.
                else dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % mod;
            }    
        }
        
        long result = 0;
        for(int i = 0; i < 10; i++ ) {
            result += dp[n][i];
        }
        System.out.println(result % mod);
    }    
}
