import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int price = 0;
        int age;

        System.out.print("나이 입력 : ");
        age = keyboard.nextInt();

        price = (age >= 18) ? 4000 :
                    (age >= 13 && age < 18) ? 3000 :
                        (age >= 7 && age <13) ? 1000:
                                (age < 7) ? 0 : 0;

        System.out.println("=====================");
        System.out.printf("입장료는 %,d 원 입니다.\n", price);
        System.out.println("=====================");
    }
}