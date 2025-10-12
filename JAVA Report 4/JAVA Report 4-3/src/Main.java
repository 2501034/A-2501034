import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int hour, minute, second, input;

        System.out.print("시간 입혁 (초) : ");
        input = keyboard.nextInt();

        hour = input / 3600;
        input = input % 3600;
        minute = input / 60;
        second = input % 60;


        System.out.printf("%d 시간 %d 분 %d 초", hour, minute, second);
    }
}