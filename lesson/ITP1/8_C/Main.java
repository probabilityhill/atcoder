// 00.06 s / 42816 KB / 641 B

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] count = new int[26];
        while(sc.hasNext()) {  // 入力が存在する間
            String input = sc.next().toLowerCase();
            for(int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if(c >= 'a' && c <= 'z') {
                    count[c - 'a']++;
                }
            }
        }
        for(int i = 0; i < 26; i++) {
            System.out.printf("%c : %d\n", 'a' + i, count[i]);
        }
    }
}
