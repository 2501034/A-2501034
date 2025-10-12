import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int money;
        char membership;
        String membershipStatus;
        String delivery;

        System.out.print("총 구매 금액 입력 : ");
        money = keyboard.nextInt();
        System.out.print("멤버십 회원 여부(Y/N) : ");
        membership =keyboard.next().charAt(0);


        membershipStatus = (membership == 'Y' ? "회원" : "비회원");

        delivery = (money >= 50000) || (membership == 'Y' && money >= 30000)  ? "무료 배송" : "무료 배송 불가" ;

        System.out.printf("당신의 구매 금액은 %,d 원 입나다.\n", money);
        System.out.printf("멤버십 %s 입니다.\n", membershipStatus);
        System.out.printf("%s\n", delivery);
    }
}