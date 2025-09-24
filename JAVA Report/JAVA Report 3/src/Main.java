import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String name = "";
        int family = 0;
        String area = "";

        System.out.print("당신의 이름은 ? ");
        name = keyboard.nextLine();
        System.out.printf("%s님의 가족은 몇명 입니까 ? ", name);
        family = keyboard.nextInt();
        System.out.printf("%s님의 가족은 어디에 살지요 ? ", name);
        area = keyboard.next();

        System.out.printf("\n %s님의 가족은 %d명 입니다.\n", name, family);
        System.out.printf(" %s님의 가족은 %s에서 살고 있습니다.", name, area);
    }
}