public class Main {
    public static void main(String[] args) {

        int chicken = 0;
        int dog;
        int total = 37;
        int leg = 102;

        for (chicken = 0; chicken <= total; chicken++) {
            dog = total - chicken;
            if (2 * chicken + 4 * dog == leg) {
                System.out.printf("닭 : %d 마리, 개 : %d 마리\n", chicken, dog);
            }
        }

        /* while (chicken <= total) {
            dog = total - chicken;
            if  (2 * chicken + 4 * dog == leg) {
                System.out.printf("닭 : %d 마리, 개 : %d 마리\n", chicken, dog);
            }
            chicken++;
        } */

        /* do {
            dog = total - chicken;
            if (2 * chicken + 4 * dog == leg) {
                System.out.printf("닭 : %d 마리, 개 : %d 마리\n", chicken, dog);
            }
            chicken++;
        } while (chicken <= total); */

    }
}