import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String grade = "";
        int out, save, living, engel;

        System.out.print("지출액, 저축액 입력 : ");
        out = keyboard.nextInt();
        save = keyboard.nextInt();

        living = out - save;
        engel = (int) (((double)living / out) * 100);

        if (engel >= 0 && engel <= 30) {
            grade = "상류층";
        } else if (engel >= 31 && engel <=50) {
            grade = "중산층";
        } else {
            grade = "하류층";
        }

        System.out.printf("당신은 엥겔지수는 %d%% 이며, %s 입니다.\n", engel, grade);
    }
}