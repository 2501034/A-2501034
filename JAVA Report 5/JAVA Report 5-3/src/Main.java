import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String user;
        int age;
        int total;
        char card;
        int price = 0;
        int time;

        System.out.print("나이 입력 : ");
        age = keyboard.nextInt();
        System.out.print("교통카드를 사용 여부 (y/n) : ");
        card = keyboard.next().charAt(0);
        System.out.print("탑승 시간 입력 (0~23) : ");
        time = keyboard.nextInt();

        if (age >= 7 && age <= 13)
            user = "어린이";
        else if (age >= 14 && age <= 19)
            user = "청소년";
        else if (age >= 20 && age <= 65)
            user = "성인";
        else if (age >= 66 && age <= 100)
            user = "어르신";
        else
            user = "영유아";


        if (user.equals("어린이")) {
            price = 450;
        } else if (user.equals("청소년")) {
            price = (card == 'y' || card == 'Y') ? 750 : 850;
        } else if (user.equals("성인")) {
            price = (card == 'y' || card == 'Y') ? 1250 : 1350;
        } else {
            price = 0;
        }

        if (time >= 22 || time <= 5) {
            total = (int) (price * 1.2);
        } else {
            total = price;
        }

        System.out.printf("%s의 요금은 %,d원 입니다.%n", user, total);

        keyboard.close();
    }
}
