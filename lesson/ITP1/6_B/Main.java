import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final String[] MARKS = {"S", "H", "C", "D"};
        boolean[][] hasCards = new boolean[4][13];
        for(int i = 0; i < N; i++) {
            int markId = Arrays.asList(MARKS).indexOf(sc.next());
            int num = sc.nextInt();
            hasCards[markId][num-1] = true;
        }
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 13; j++) {
                if(!hasCards[i][j]) {
                    System.out.println(MARKS[i] + " " + (j + 1));
                }
            }
        }
    }
}
