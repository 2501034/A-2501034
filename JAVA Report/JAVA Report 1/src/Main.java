import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        Short age = 0;
        Double weight = 0.0;
        Float height = 0.0f;

        System.out.print("당신의 나이는 ? ");
        age = keyboard.nextShort();
        System.out.printf("당신의 체중은 ? ");
        weight = keyboard.nextDouble();
        System.out.printf("당신의 신장은 ? ");
        height = keyboard.nextFloat();

        System.out.printf("당신의 나이는 %d살 입니다.\n", age);
        System.out.printf("당신의 체중은 %.1fkg 입니다.\n", weight);
        System.out.printf("당신의 신장은 %.1fcm 입니다.\n", height);
    }
}