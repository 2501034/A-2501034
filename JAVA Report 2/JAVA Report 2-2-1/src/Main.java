import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard =new Scanner(System.in);
        String school = "";
        String name = "";
        int age = 0;
        char gender = ' ';
        float height = 0.0f;
        float weight = 0.0f;

        System.out.print("당신의 학교는 : ");
        school = keyboard.nextLine();
        System.out.print("당신의 이름은 : ");
        name = keyboard.nextLine();
        System.out.print("당신의 나이는 : ");
        age = keyboard.nextInt();
        System.out.print("당신의 성별은 (남/여) : ");
        gender = keyboard.next().charAt(0);
        System.out.print("당신의 키는 : ");
        height = keyboard.nextFloat();
        System.out.print("당신의 몸무게는 : ");
        weight = keyboard.nextFloat();

        System.out.println("*********************");
        System.out.printf("학교 : %s\n", school);
        System.out.printf("이름 : %s\n", name);
        System.out.printf("나이 : %d\n", age);
        System.out.printf("성별 : %c\n", gender);
        System.out.printf("신장 : %.1f %c\n", height, '\u339d');
        System.out.printf("체중 : %.1f %c\n", weight, '\u338f');
        System.out.println("*********************");
    }
}