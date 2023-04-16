// 00.37 s / 69756 KB / 997 B

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int M = sc.nextInt();
        final int L = sc.nextInt();
        final int[][] A = new int[N][M];
        final int[][] B = new int[M][L];
        for(int r = 0; r < N; r++) {
            for(int c = 0; c < M; c++) {
                A[r][c] = sc.nextInt();
            }
        }
        for(int r = 0; r < M; r++) {
            for(int c = 0; c < L; c++) {
                B[r][c] = sc.nextInt();
            }
        }
        for(int r = 0; r < N; r++) {
            for(int c = 0; c < L; c++) {
                long sum = 0;
                for(int i = 0; i < M; i++) {
                    sum += A[r][i] * B[i][c];
                }
                System.out.print(sum);
                if(c != L - 1) System.out.print(" ");
            }
            System.out.println();
        }
    }
}
