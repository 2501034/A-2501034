import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int temperature;
        String result;

        System.out.print("현재 온도 입력(정수) : ");
        temperature = keyboard.nextInt();

        if (temperature >= 35) {
            result = "폭염 경보";
        } else if (temperature >= 30 && temperature < 35) {
            result = "폭염 주의보";
        } else if (temperature >= -10 && temperature < 30) {
            result = "정상 온도";
        } else {
            result = "한파 경보";
        }

        System.out.print(result);
    }
}