// 00.06 s / 42356 KB / 650 B

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while(true) {
            final int N = sc.nextInt();    // 3 <= N <= 100 
            int X = sc.nextInt();          // 0 <= X <= 300
            if(N == 0 && X == 0) break;    // 終了条件
            int count = 0;
            for(int i = 1; i <= N; i++) {
                for(int j = i + 1; j <= N; j++) {
                    int k = X - i - j;
                    if(k >= j + 1 && k <= N) count++;
                }
            }
            System.out.println(count);
        }
    }
}
