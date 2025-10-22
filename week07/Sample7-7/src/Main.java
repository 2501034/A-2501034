import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final int pay = 11500;
        int hours;
        int salary;
        String result;
        int extrapay;

        System.out.print("주당 아르바이트 시간 입력 : ");
        hours = keyboard.nextInt();

        if (hours > 40) {
            salary = 40 * pay;
            extrapay = (int) ((hours - 40) * (pay * 1.5));
            result = String.format("수당 : %,d원과 급여 : %,d원, 합계 = %,d 원"
                    , extrapay, salary, salary + extrapay);
        } else {
            salary = hours * pay;
            result = String.format("급여 : %,d원", salary);
        }
        System.out.printf("시간당 임금 : %,d원\n", pay);
        System.out.printf("주당 %d 시간 아르바이트를 하면, %s\n", hours, salary);

    }
}