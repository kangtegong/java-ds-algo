import java.io.*;
import java.util.*;

// 15552
public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int x = Integer.parseInt(bf.readLine());
        
        for (int i = 0; i < x; i++) {
        	String s = bf.readLine();
        	StringTokenizer st = new StringTokenizer(s);
        	int a = Integer.parseInt(st.nextToken());
        	int b = Integer.parseInt(st.nextToken());
        	
        	bw.write(String.valueOf(a+b));
        	bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
 
