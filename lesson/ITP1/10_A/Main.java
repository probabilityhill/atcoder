import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double x1 = sc.nextDouble();
        final double y1 = sc.nextDouble();
        final double x2 = sc.nextDouble();
        final double y2 = sc.nextDouble();
        System.out.printf("%.5f", Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)));
        sc.close();
    }
}
