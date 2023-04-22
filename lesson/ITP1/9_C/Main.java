import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        int scoreTaro = 0;
        int scoreHanako = 0;
        String wordTaro;
        String wordHanako;
        int TminusH;
        for(int i = 0; i < N; i++) {
            wordTaro = sc.next();
            wordHanako = sc.next();
            TminusH = wordTaro.compareTo(wordHanako);
            if(TminusH > 0) {
                scoreTaro += 3;
            }
            else if(TminusH < 0) {
                scoreHanako += 3;
            }
            else {
                scoreTaro++;
                scoreHanako++;
            }
        }
        System.out.println(scoreTaro + " " + scoreHanako);
        sc.close();
    }
}
