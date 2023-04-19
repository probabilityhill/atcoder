// 00.09 s / 46672 KB / 422 B

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str += str;
        String word = sc.next();
        String output;
        if(str.contains(word)) {
            output = "Yes";
        }
        else {
            output = "No";
        }
        System.out.println(output);
    }
}
