import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int age, time, price;
        int total = 0;

        System.out.print("나이 입력 : ");
        age = keyboard.nextInt();
        System.out.print("관람할 시간 입력 (0 ~ 24) : ");
        time = keyboard.nextInt();

        price = 10000;
        if (time < 10) {
            total = (int) (price * 0.8);
        } else if (age >= 8 && age <= 18) {
            total = (int) (price * 0.7);
        } else if (age >= 65) {
            total = (int) (price * 0.6);
        } else {
            total = price;
        }

        System.out.printf("영화 요금은 %,d 원 입니다.\n",total);
    }
}