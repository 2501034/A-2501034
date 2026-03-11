import java.io.IOException;
import java.util.Scanner;

public class Main {

    static String[][][] students = new String[][][]{
            new String[][]{ // 1반 8명
                    {"2101234", "홍길동", "남"}, {"2101235", "경복대", "여"},
                    {"2101236", "한국인", "남"}, {"2101345", "정상인", "여"},
                    {"2101238", "이동건", "남"}, {"2101347", "최유리", "여"},
                    {"2101239", "김철수", "남"}, {"2101348", "김유정", "여"}},
            new String[][]{ // 2반 9명
                    {"2301345", "구자철", "남"}, {"2301435", "이가을", "여"},
                    {"2301443", "김광현", "남"}, {"2301678", "박종철", "남"},
                    {"2301679", "올시즌", "여"}, {"2301645", "이종근", "남"},
                    {"2301668", "박민정", "여"}, {"2301646", "김수형", "남"},
                    {"2301658", "박종철", "남"}},
            new String[][]{ // 3반 10명
                    {"2401234", "한민국", "여"}, {"2401456", "안우진", "남"},
                    {"2401789", "이대한", "남"}, {"2301678", "박종철", "남"},
                    {"2301895", "김진영", "남"}, {"2301899", "장영세", "남"},
                    {"2301456", "박창수", "남"}, {"2301412", "박종근", "남"},
                    {"2301485", "김수근", "남"}, {"2301652", "김민지", "여"}},
    };

    // subject[4과목][3반][학생수]
    static int[][][] subject = new int[][][]{
            new int[][]{new int[8], new int[9], new int[10]}, // 국어
            new int[][]{new int[8], new int[9], new int[10]}, // 영어
            new int[][]{new int[8], new int[9], new int[10]}, // 수학
            new int[][]{new int[8], new int[9], new int[10]}  // 선택
    };

    static int[][] total = new int[3][];
    static double[][] avg = new double[3][];
    static int[][] rankClass = new int[3][];
    static int[] rankSchool;
    static double schoolAvg;
    static double [] classAvg = new double[3];

    public static void main(String[] args) throws IOException {

        initCalcArrays();

        Input.DataRead(students, subject);

        Compute.TotalAvg(students, subject, total, avg);
        Compute.ClassAvg(avg, classAvg);
        schoolAvg = Compute.SchoolAvg(classAvg);
        Compute.RankClass(students, total, rankClass);
        Compute.RankSchool(students, total, rankSchool);


        for (int ban = 0; ban < students.length; ban++) {

            for (int i = 0; i < students[ban].length - 1; i++) {
                for (int j = 0; j < students[ban].length - 1 - i; j++) {

                    int h1 = Integer.parseInt(students[ban][j][0]);
                    int h2 = Integer.parseInt(students[ban][j + 1][0]);

                    if (h1 > h2) {

                        // ① students swap
                        String[] tmpS = students[ban][j];
                        students[ban][j] = students[ban][j + 1];
                        students[ban][j + 1] = tmpS;

                        // ② subject swap (4과목 모두)
                        for (int s = 0; s < 4; s++) {
                            int tmp = subject[s][ban][j];
                            subject[s][ban][j] = subject[s][ban][j + 1];
                            subject[s][ban][j + 1] = tmp;
                        }

                        // ③ total swap
                        int t = total[ban][j];
                        total[ban][j] = total[ban][j + 1];
                        total[ban][j + 1] = t;

                        // ④ avg swap
                        double a = avg[ban][j];
                        avg[ban][j] = avg[ban][j + 1];
                        avg[ban][j + 1] = a;

                        // ⑤ rankClass swap
                        int r = rankClass[ban][j];
                        rankClass[ban][j] = rankClass[ban][j + 1];
                        rankClass[ban][j + 1] = r;
                    }
                }
            }
        }

        Output.display(students, subject, total, avg, rankClass, rankSchool,
                classAvg,schoolAvg);
    }

    public static void initCalcArrays() {
        int totalCount = 0;

        for (int ban = 0; ban < students.length; ban++) {
            int size = students[ban].length;

            total[ban] = new int[size];
            avg[ban] = new double[size];
            rankClass[ban] = new int[size];

            totalCount += size;
        }

        rankSchool = new int[totalCount];
    }
}