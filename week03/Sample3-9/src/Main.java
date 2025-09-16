import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String name = "양준혁";
        int bat = 0;
        int hit = 0;
        float avg =0.0f;

        System.out.print("오늘의 타수 입력 : ");
        bat = keyboard.nextInt();
        System.out.print("오늘의 안타수 입력 : ");
        hit = keyboard.nextInt();

        avg = (float) hit / bat;

        System.out.printf("\n선수 이름 : %s\n",name);
        System.out.printf("오늘의 타수 : %d\n",bat);
        System.out.printf("오늘의 안타수 : %d\n",hit);
        System.out.printf("오늘의 타율 : %.2f\n",avg);
    }
}