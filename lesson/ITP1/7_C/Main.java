// 00.28 s / 58604 KB / 1200 B

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        final int ROW = sc.nextInt();
        final int COL = sc.nextInt();
        final int[][] TABLE = new int[ROW + 1][COL + 1];
        for(int r = 0; r < ROW; r++) {
            for(int c = 0; c < COL; c++) {
                TABLE[r][c] = sc.nextInt();
            }
        }
        // 行ごとの合計を求める
        for(int r = 0; r < ROW; r++) {
            int sumRow = 0;
            for(int c = 0; c < COL; c++) {
                sumRow += TABLE[r][c];
            }
            TABLE[r][COL] = sumRow;
        }
        // 列ごとの合計を求める
        for(int c = 0; c <= COL; c++) {
            int sumCol = 0;
            for(int r = 0; r < ROW; r++) {
                sumCol += TABLE[r][c];
            }
            TABLE[ROW][c] = sumCol;
        }
        // 出力
        for(int r = 0; r <= ROW; r++) {
            for(int c = 0; c <= COL; c++) {
                System.out.print(TABLE[r][c]);
                if(c != COL) System.out.print(" ");
            }
            System.out.println();
        }
    }
}
