import java.io.IOException;
import java.util.Scanner;

public class Input {
    public static int readData() throws IOException {
        Scanner keyboard = new Scanner(System.in);
        int radius;

        while (true) {
            System.out.print("원의 반지름 입력 : ");
            radius = keyboard.nextInt();
            if (radius > 0)
                break;
            else {
                System.out.println("ERORR : 양의 정수 입력");
                System.in.read();
            }
        }
        return radius;
    }
}
