import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int[] score = new int[10]; // 10개 정수 저장 배열
        int total = 0;
        float average = 0f;
        int max, min;

        System.out.println("10개의 정수 데이터를 입력하세요.");

        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + " : ");
            score[i] = keyboard.nextInt();
        }

        max = score[0];
        min = score[0];

        for (int i = 0; i < 10; i++) {
            total += score[i];

            if (score[i] > max)
                max = score[i];

            if (score[i] < min)
                min = score[i];
        }

        average = total / 10.0f;

        System.out.println("\n출력 결과");
        System.out.println("합계 : " + total);
        System.out.println("평균 : " + average);
        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);

        keyboard.close();

    }
}