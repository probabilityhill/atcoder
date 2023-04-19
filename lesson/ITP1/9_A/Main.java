// 00.05 s / 42280 KB / 427 B

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        final String WORD = sc.next();
        int count = 0;
        String str;
        while(!(str = sc.next()).equals("END_OF_TEXT")) {
            if(str.toLowerCase().equals(WORD)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
