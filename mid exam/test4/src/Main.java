import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int in,saletax,intax,tax,sale;
        float benefit = 0.0f;

        System.out.print("매입한 상품의 원재료 가격 입력 : ");
        in = keyboard.nextInt();
        System.out.print("이익률 입력 : ");
        benefit = keyboard.nextFloat();

        sale = (int) (in * ( 1 + benefit));
        saletax = (int) (sale * 0.1f);
        intax = (int) (in * 0.1f);
        tax = saletax - intax;

        System.out.printf("당신이 낼 세금은 %,d 원 입니다.",tax);
    }
}