import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int A, B, C;
        String result;
        double S;
        double area;
        boolean flag = true;

        System.out.print("삼각형의 세변의 길이 입력 : ");
        A = keyboard.nextInt();
        B = keyboard.nextInt();
        C = keyboard.nextInt();

        if ((A > 0 && B > 0 && C >  0) || (A+B > C && B + C > A && C + A > B)) {
            S = (A + B + C) / 2.0;
            area = Math.sqrt(S * (S-A) * (S-B) * (S-C));
            result = String.format("삼각형의 넓이 : %.2f \u33a0.", area);
        } else {
            result = "삼각형을 만들수가 없습니다.";
            flag = false;
        }

        if (flag)
            System.out.printf("%s" , result);
        else
            System.err.printf("%s" ,result);
        System.out.printf("세변의 길이 %d cm, %d cm, %d cm 이면 %s\n",A ,B ,C ,result);
    }
}