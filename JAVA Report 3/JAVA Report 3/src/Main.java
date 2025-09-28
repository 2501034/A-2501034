import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int dollar;
        int half;
        int quarter;
        int dime;
        int nickel;
        int penny;
        int cent;
        double total;

        System.out.println("미국 화폐 단위별 개수를 입력하세요.");
        System.out.print("달러 (1 Dollar = 100 Cents) 개수: ");
        dollar = keyboard.nextInt();
        System.out.print("하프 (1 Half Dollar = 50 Cents) 개수: ");
        half = keyboard.nextInt();
        System.out.print("쿼터 (1 Quarter = 25 Cents) 개수: ");
        quarter = keyboard.nextInt();
        System.out.print("다임 (1 Dime = 10 Cents) 개수: ");
        dime = keyboard.nextInt();
        System.out.print("니켈 (1 Nickel = 5 Cents) 개수: ");
        nickel = keyboard.nextInt();
        System.out.print("페니 (1 Penny = 1 Cent) 개수: ");
        penny = keyboard.nextInt();

                cent =
                                (dollar * 100) +
                                (half * 50) +
                                (quarter * 25) +
                                (dime * 10) +
                                (nickel * 5) +
                                (penny * 1);

                total = cent / 100.0;

                System.out.println("\n--- 계산 결과 ---");
                System.out.printf("총 센트(Cents)는 %d Cents 입니다.\n", cent);
                System.out.printf("총 금액은 $%.2f 입니다.\n", total);

    }
}