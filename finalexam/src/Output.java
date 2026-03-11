public class Output {
    public static void display(String[][][] students, int[][][] subject,
                               int[][] total, double[][] avg, int[][] rankClass,
                               int[] rankSchool, double[] classAvg, double schoolAvg) {
        System.out.println("\n==================== 성적 출력 ====================");

        int schoolIdx = 0;

        for (int ban = 0; ban < students.length; ban++) {

            System.out.println("\n▶ " + (ban + 1) + "반 성적표");
            System.out.println("학번\t이름\t성별\t국\t영\t수\t선택\t총점\t평균\t반등수\t전교등수\t비고");

            double banAvg = 0;
            for (int i = 0; i < students[ban].length; i++) {
                banAvg += avg[ban][i];
            }
            banAvg /= students[ban].length;

            for (int i = 0; i < students[ban].length; i++) {

                System.out.printf("%s\t%s\t%s\t",
                        students[ban][i][0], students[ban][i][1], students[ban][i][2]);

                System.out.printf("%d\t%d\t%d\t%d\t",
                        subject[0][ban][i], subject[1][ban][i],
                        subject[2][ban][i], subject[3][ban][i]);

                System.out.printf("%d\t%.2f\t%d\t%d\t",
                        total[ban][i], avg[ban][i],
                        rankClass[ban][i], rankSchool[schoolIdx]);

                if (avg[ban][i] < banAvg)
                    System.out.print("반평균 미만");

                System.out.println();

                schoolIdx++;
            }
            System.out.printf("▶ %d반 평균 : %.2f\n\n", ban + 1, classAvg[ban]);
        }
        System.out.printf("◆ 전체 평균 : %.2f\n", schoolAvg);
    }
}