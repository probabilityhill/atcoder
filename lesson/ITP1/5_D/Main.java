import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        for(int i = 3; i <= N; i++) {
            boolean flag = false;
            
            if(i % 3 == 0) {  // 3の倍数かどうか判定
                flag = true;
            }
            else {            // 3を含むかどうか判定
                int tmp = i;
                while(tmp > 0) {
                    if(tmp % 10 == 3) {
                        flag = true;
                        break;
                    }
                    tmp /= 10;
                }
            }
            
            if(flag) {
                System.out.print(" " + i);
            }            
        }
        System.out.println();
        sc.close();
    }
}
