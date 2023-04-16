import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int scoreMidExam = sc.nextInt();
            int scoreFinalExam = sc.nextInt();
            int scoreReExam = sc.nextInt();
            if(scoreMidExam == -1 && scoreFinalExam == -1 && scoreReExam == -1) break;  // 終了条件
            int sumScore = scoreMidExam + scoreFinalExam;
            char grade = 'F';
            if(scoreMidExam == -1 || scoreFinalExam == -1) {
                grade = 'F';
            }
            else if(sumScore>= 80) {
                grade = 'A';
            }
            else if(sumScore >= 65) {
                grade = 'B';
            }
            else if(sumScore >= 50 || (sumScore >= 30 && scoreReExam >= 50)) {
                grade = 'C';
            }
            else if(sumScore >= 30) {
                grade = 'D';
            }
            System.out.println(grade);
        }
    }
}
