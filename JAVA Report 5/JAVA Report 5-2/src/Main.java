import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int total = 0;
        int litter = 0;
        int price = 0;
        int price1 = 0;


        System.out.print("주유할 리터를 입력 : ");
        litter = keyboard.nextInt();
        System.out.print("리터당 가격을 입력 : ");
        price = keyboard.nextInt();

        price1 = litter * price;

        total = price1 >= 50000 ? (int) (price1 * (0.93)) : price;

        total *= (int) (1.1);

        System.out.printf("금액은 총 %,d 원입니다.",total);
    }
}