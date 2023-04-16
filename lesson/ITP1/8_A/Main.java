// 00.08 s / 42384 KB / 560 B

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        final String LINE = sc.nextLine();
        for(int i = 0; i < LINE.length(); i++) {
            char c = LINE.charAt(i);
            if(c >= 'A' && c <= 'Z') {
                c = Character.toLowerCase(c);
            }
            else if(c >= 'a' && c <= 'z') {
                c = Character.toUpperCase(c);
            }
            System.out.print(c);
        }
        System.out.println();
    }
}
