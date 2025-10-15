import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final int CIGA = 7; //담배 1개비당 7분 수명 단축
        int life; // 피운 년수
        int ga; // 하루 개비 수

        float minute;
        float year = 0;
        float day = 0;
        float hour = 0;
        float remainMinute = 0;

        System.out.print("당신은 몇 년 동안 담배를 피웠나요 ? ");
        life = keyboard.nextInt();
        System.out.print("하루에 평균 몇 개비를 피웠나요 ? ");
        ga = keyboard.nextInt();

        minute = (float) life * 365 * ga * CIGA;

        year = minute / 60 / 24 / 365;
        day = (minute / 60 / 24) % 365;
        hour = (minute / 60) % 24;
        remainMinute = minute % 60;


        System.out.printf("담배 1개비는 %d분의 생명을 단축합니다.\n ",CIGA);
        System.out.printf("%d년동안 %d 개비의 담배를 피우면 %,.1f분의 생명이 단축됩니다.\n"
                ,life, ga, minute);
        System.out.printf("%,.1f분은 %.0f년 %.0f일 %.0f시간 %.0f분 입니다.\n"
                , minute, year, day, hour, remainMinute);
    }
}