import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int sale;
        double price;
        double tax;

        System.out.print("판매금액 입력 : ");
        sale = keyboard.nextInt();

        price = (sale * 0.90);

        tax = sale * 0.10;

        System.out.printf("판매금액 %,d원의 금액은 %,.0f원, 세금은 %,.0f원 입니다.",sale, price, tax);
    }
}