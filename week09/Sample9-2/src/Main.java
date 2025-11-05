import javax.imageio.IIOException;
import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {

        Scanner keyboard = new Scanner(System.in);
        final int START = 1;
        final int LAST = 100;
        int start, last;
        int sum = 0;

        while (true) {
            System.out.printf("어디서부터 더할까요? : ");
            start = keyboard.nextInt();
            System.out.printf("어디서까지 더할까요? : ");
            last = keyboard.nextInt();
            if (start < last) {
                break;
            } else {
                System.err.println("ERORR : 시작은 끝보다 작아야함.");
                System.in.read();
            }
        }

        for (int i = start; i <= last; i++) {
            sum += i;
        }
        System.out.printf("%d + %d + ... + %d + %d = %d\n",start ,start +1,last -1, last ,sum);
    }
}