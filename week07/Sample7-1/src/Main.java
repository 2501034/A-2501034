import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num1, num2;
        float result;

        System.out.print("분자 분모 입력 : ");
        num1 = keyboard.nextInt();
        num2 = keyboard.nextInt();

        float temp = num2 == 0 ? 0.0f : 1;
        (String) temp = temp == 0 ? "ERROR : 분모가 0이면 안됩니다." :
                String.format("%d / %d = %.2f\n",num1, num2,temp);

        if (result == 0.0) {
            float result = (float) num1 / num2;
            System.out.printf("%d / %d = %.2f\n",num1, num2,result);
            System.err.println("ERROR : 분모가 0이면 안됩니다.");
        } else {
            System.err.println(result);
        }

        if (num2 == 0) {
            System.err.println("ERROR : 분모가 0이면 안됩니다.");
        } else {

            System.out.printf("%d / %d = %.2f\n",num1, num2,temp);
        }
    }
}