import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int M = sc.nextInt();
        final int[][] A = new int[N][M];
        final int[] B = new int[M];
        for(int row = 0; row < N; row++) {
            for(int col = 0; col < M; col++) {
                A[row][col] = sc.nextInt();
            }  
        }
        for(int row = 0; row < M; row++) {
            B[row] = sc.nextInt();
        }  
        for(int row = 0; row < N; row++) {
            int sum = 0;
            for(int col = 0; col < M; col++) {
                sum += A[row][col] * B[col];
            }
            System.out.println(sum);
        }
    }
}
