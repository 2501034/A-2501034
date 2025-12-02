import java.util.Scanner;

public class Input {
    public static int readData() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("연도를 입력하세요 : ");
        return keyboard.nextInt();
    }
}
