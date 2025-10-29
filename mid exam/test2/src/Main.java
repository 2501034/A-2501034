import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        float time = 0.0f;
        int day, hour, minute, second, totalsecond;

        System.out.print("시간 입력 : ");
        time = keyboard.nextFloat();

        totalsecond = (int)(time * 3600);

        day = (int) (totalsecond / (24 * 3600));
        totalsecond %= (24 * 3600);

        hour = (int) ((totalsecond / 3600));
        totalsecond %= 3600;

        minute = (int) (totalsecond / 60);
        second = (int) (totalsecond % 60);

        System.out.printf("%.2f 시간은 %d 일 %d 시간 %d 분 %d 초 입니다.\n"
                , time, day, hour, minute, second);
    }
}