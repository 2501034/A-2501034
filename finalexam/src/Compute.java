public class Compute {
    public static void TotalAvg(String[][][] students, int[][][] subject, int[][] total, double[][] avg) {
        for (int ban = 0; ban < students.length; ban++) {
            for (int i = 0; i < students[ban].length; i++) {

                int sum = subject[0][ban][i] + subject[1][ban][i] +
                        subject[2][ban][i] + subject[3][ban][i];

                total[ban][i] = sum;
                avg[ban][i] = sum / 4.0;
            }

        }
    }


    public static void RankClass(String[][][] students, int[][] total, int[][] rankClass) {
        for (int ban = 0; ban < students.length; ban++) {

            for (int i = 0; i < students[ban].length; i++) {
                int rank = 1;

                for (int j = 0; j < students[ban].length; j++) {
                    if (total[ban][j] > total[ban][i]) {
                        rank++;
                    }
                }
                rankClass[ban][i] = rank;
            }
        }

    }


    public static void RankSchool(String[][][] students, int[][] total, int[] rankSchool) {
        int idx = 0;
        int stuCount = rankSchool.length;

        int[] allTotals = new int[stuCount];

        for (int ban = 0; ban < students.length; ban++) {
            for (int i = 0; i < students[ban].length; i++) {
                allTotals[idx++] = total[ban][i];
            }
        }

        for (int i = 0; i < stuCount; i++) {
            int rank = 1;
            for (int j = 0; j < stuCount; j++) {
                if (allTotals[j] > allTotals[i]) rank++;
            }
            rankSchool[i] = rank;
        }

    }

    public static void ClassAvg(double[][] avg, double[] classAvg) {
        for (int ban = 0; ban < avg.length; ban++) {
            double sum = 0;
            for (int i = 0; i < avg[ban].length; i++) {
                sum += avg[ban][i];
            }
            classAvg[ban] = sum / avg[ban].length;
        }
    }


    public static double SchoolAvg(double[] classAvg) {
        double sum = 0;
        for (int i = 0; i < classAvg.length; i++) {
            sum += classAvg[i];
        }
        return sum / classAvg.length;
    }
}