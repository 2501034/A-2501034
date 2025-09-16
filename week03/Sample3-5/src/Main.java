import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        float litter = 0.0f;
        float km = 0.0f;
        float result = 0.0f;

        System.out.print("사용 연료 량 입력 : ");
        litter = keyboard.nextFloat();
        System.out.print("운행 거리 : ");
        km = keyboard.nextFloat();

        result = km / litter;

        System.out.printf("사용 연료 량 : %.2f %c\n", km, '\u2113');
        System.out.printf("운행 거리 : %.2f km\n", km);
        System.out.printf("연비 : %.2f km/%c\n", result, '\u2113');
    }
}