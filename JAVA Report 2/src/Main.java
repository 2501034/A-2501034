import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int radius;

        System.out.print("원의 반지름 입력 : ");
        radius = keyboard.nextInt();

        double boxArea = 4 * radius * radius;
        double circleArea = radius * radius * Math.PI;
        double area = boxArea - circleArea;

        System.out.printf("\n원의 반지름 : %d cm\n\n", radius);
        System.out.printf("정사각형 면적 : %.0f cm²\n", boxArea);
        System.out.printf("원의 면적 : %.2f cm²\n", circleArea);
        System.out.printf("구하는 면적 : %.2f cm²\n", area);
    }
}