import java.util.Scanner;

public class Input {
    public static int[] readData() {
        Scanner keyboard = new Scanner(System.in);
        int[] nums = new int[4];

        System.out.print("1번째 정수 입력 : ");
        nums[0] = keyboard.nextInt();

        System.out.print("2번째 정수 입력 : ");
        nums[1] = keyboard.nextInt();

        System.out.print("3번째 정수 입력 : ");
        nums[2] = keyboard.nextInt();

        System.out.print("4번째 정수 입력 : ");
        nums[3] = keyboard.nextInt();

        return nums;
    }
}
