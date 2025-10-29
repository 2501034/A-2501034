import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int radius = 0;
        float pi = 3.141592f;
        float surface;
        float volume;

        System.out.print("구의 반지름 입력 : ");
        radius = keyboard.nextInt();

        volume = 4 / 3 * pi * (radius * radius * radius);
        surface = 4 * pi * (radius * radius);

        System.out.printf("구의 표면적은 %.2f \u33a0 이고, 구의 부피는 %.2f \u33a4 입니다."
                ,surface, volume);
    }
}