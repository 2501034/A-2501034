import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int[] ip = new int[4];
        int nogood = 0;
        int xdata;

        System.out.println("투표를 시작합니다.");
        System.out.println("1~4번 후보 중 번호를 입력하세요.");
        System.out.println("정수가 아닌 값을 입력하면 종료합니다.\n");

        while (true) {
            System.out.print("후보 번호 입력 : ");

            if (!keyboard.hasNextInt()) {
                break;
            }

            xdata = keyboard.nextInt();

            if (xdata >= 1 && xdata <= 4) {
                ip[xdata - 1]++;
            } else {
                nogood++;
            }
        }

        int total = ip[0] + ip[1] + ip[2] + ip[3] + nogood;

        System.out.println("\n투표 결과");
        System.out.println("---------------");
        System.out.println("1번 후보 : " + ip[0] + "표");
        System.out.println("2번 후보 : " + ip[1] + "표");
        System.out.println("3번 후보 : " + ip[2] + "표");
        System.out.println("4번 후보 : " + ip[3] + "표");
        System.out.println("무효표   : " + nogood + "표");
        System.out.println("\n총 " + total + "표");

        keyboard.close();

    }
}