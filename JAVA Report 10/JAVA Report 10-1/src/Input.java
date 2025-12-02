import java.util.Scanner;

public class Input {

    public static int[] readData() {
        Scanner keyboard = new Scanner(System.in);
        int[] nums = new int[2];

        System.out.print("첫 번째 정수 입력 : ");
        nums[0] = keyboard.nextInt();

        System.out.print("두 번째 정수 입력 : ");
        nums[1] = keyboard.nextInt();

        return nums;
    }
}
