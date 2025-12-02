import java.util.Scanner;

public class Input {
    public static long readData() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("금액을 입력하세요(최대 16자리) : ");
        return keyboard.nextLong();
    }
}
