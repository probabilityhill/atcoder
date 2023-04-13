import java.util.*;

class Main {
    public static void main(String[] args) {
        int h;
        int w;
        Scanner sc = new Scanner(System.in);
        while(true) {
            h = sc.nextInt();
            w = sc.nextInt();
            if(h * w == 0) {
                break;
            }
            for(int i = 0; i < h; i++) {
                for(int j = 0; j < w; j++) {
                    if(i == 0 || i == h-1 || j == 0 || j == w-1) {
                        System.out.print("#");
                    } else {
                        System.out.print(".");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
        sc.close();
    }
}
