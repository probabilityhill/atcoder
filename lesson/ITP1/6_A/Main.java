import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        int[] array = new int[N];
        for(int i = N-1; i >= 0; i--) {
            array[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++) {
            System.out.print(array[i]);
            if(i >= 0 && i < N-1) System.out.print(" ");
        }
        System.out.println();
    }
}
