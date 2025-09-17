import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        double celsius = 0.0;
        double fahrenheit = 0.0;

        System.out.print("화씨로 변환할 섭씨 온도 입력 : ");
        celsius = keyboard.nextDouble();

        fahrenheit = celsius * 9 / 5 + 32;

        System.out.printf("섭씨 온도 %.1f %c는 화씨 온도 %.1f %c 입니다.", celsius, '\u2103', fahrenheit, '\u2109');
    }
}