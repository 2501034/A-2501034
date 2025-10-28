import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int min, mid, max;
        int x, y, z;

        System.out.print("3개의 정수 입력 : ");
        x = keyboard.nextInt();
        y = keyboard.nextInt();
        z = keyboard.nextInt();

        if (x >= y && x >= z) {         // x가 가장 클떼
            max = x;
            if (y >= z) {
                mid = y;
                min = z;
            } else {
                mid = z;
                min = y;
            }
        } else if (y >= x && y >= z) {  //y가 가장 클때
            max = y;
            if (x >= z) {
                mid = x;
                min = z;
            } else {
                mid = z;
                min = x;
            }
        } else {
            max = z;
            if (x >= y) {
                mid = x;
                min = y;
            } else {
                mid = y;
                min = x;
            }
        }


        System.out.printf("입력받은 %d, %d, %d를 크기 순으로 나열하면 %d, %d, %d 입니다."
                , x, y, z, min, mid, max);
    }
}