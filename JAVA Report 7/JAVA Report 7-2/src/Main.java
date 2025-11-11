public class Main {
    public static void main(String[] args) {
        int month, amount;
        int year = 0;

         /* for (year = 0; year <= 30; year++) {
            month = ((500 * 10) + (100 * 10));
            amount = (month * 12) * year;
            if (year >= 30) {
                System.out.printf("총 저금액 : %,d 원\n", amount);
            }
        } */

           while (year <= 30) {
            month = ((500 * 10) + (100 * 10));
            amount = (month * 12) * year;
            if (year >= 30) {
                System.out.printf("총 저금액 : %,d 원\n", amount);
            }
            year++;
        }

         /* do {
            month = ((500 * 10) + (100 * 10));
            amount = (month * 12) * year;
            if (year >= 30) {
                System.out.printf("총 저금액 : %,d 원\n", amount);
            }
            year++;
        } while (year <= 30); */

    }
}