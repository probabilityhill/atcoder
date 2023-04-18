// 00.06 s / 44228 KB / 473 B

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while(true) {
            String input = sc.next();
            if(input.equals("0")) {
                break;
            }
            int sum = 0;
            for(int i = 0; i < input.length(); i++) {
                sum += input.charAt(i) - '0';
            }
            System.out.println(sum);
        }
    }
}
