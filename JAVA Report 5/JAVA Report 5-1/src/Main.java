import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int meal;
        String result;

        System.out.print("구매할 식권 개수 입력 : ");
        meal = keyboard.nextInt();

        if (meal >= 30) {
            result = "30장 이상이면 20% 할인";
        } else if (meal >= 20) {
            result = "20장 이상이면 15% 할인";
        } else if (meal >= 10) {
            result = "10장 이상이면 10% 할인";
        } else {
            result = "10장 미만은 할인되지 않습니다.";
        }

        System.out.println(result);
    }
}