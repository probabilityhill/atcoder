import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int NUM_BUILDINGS = 4;
        final int NUM_FLOORS = 3;
        final int NUM_ROOMS = 10;
        int[][][] residence = new int[NUM_BUILDINGS][NUM_FLOORS][NUM_ROOMS];
        for(int i = 0; i < N; i++) {
            int b = sc.nextInt() - 1;
            int f = sc.nextInt() - 1;
            int r = sc.nextInt() - 1;
            int v = residence[b][f][r] + sc.nextInt();
            if(v < 0) v = 0;
            residence[b][f][r] = v;
        }
        for(int i = 0; i < NUM_BUILDINGS; i++) {
            for(int j = 0; j < NUM_FLOORS; j++) {
                for(int k = 0; k < NUM_ROOMS; k++) {
                    System.out.print(" " + residence[i][j][k]);
                }
                System.out.println();
            }
            if(i != NUM_BUILDINGS - 1) System.out.println("####################");
        }
    }
}
