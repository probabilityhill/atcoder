// 00.06 s / 40660 KB / 502 B

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        final String WORD = sc.next();
        int count = 0;
        String str;
        while(true) {
            str = sc.next();
            if(str.equals("END_OF_TEXT")) {
                break;
            }
            if(str.toLowerCase().equals(WORD)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
