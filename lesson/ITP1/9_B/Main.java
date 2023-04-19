// 00.10 s / 48524 KB / 553 B

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str;
        int shuffleTimes;
        int shuffleSize;
        while(!(str = sc.next()).equals("-")) {
            shuffleTimes = sc.nextInt();
            for(int i = 0; i < shuffleTimes; i++) {
                shuffleSize = sc.nextInt();
                str = str.substring(shuffleSize) + str.substring(0, shuffleSize);
            }
            System.out.println(str);
        }
    }
}
