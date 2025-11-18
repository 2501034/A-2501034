import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String[] id = new String[10];
        String[] name = new String[10];

        int[] mid = new int[10];
        int[] fin = new int[10];
        int[] quiz = new int[10];
        int[] report = new int[10];
        int[] attend = new int[10];

        double[] wavg = new double[10];


        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + "번째 학생 정보 입력");

            System.out.print("학번: ");
            id[i] = keyboard.next();

            System.out.print("이름: ");
            name[i] = keyboard.next();

            System.out.print("중간 점수: ");
            mid[i] = keyboard.nextInt();

            System.out.print("기말 점수: ");
            fin[i] = keyboard.nextInt();

            System.out.print("퀴즈 점수: ");
            quiz[i] = keyboard.nextInt();

            System.out.print("레포트 점수: ");
            report[i] = keyboard.nextInt();

            System.out.print("출석 점수: ");
            attend[i] = keyboard.nextInt();


            wavg[i] = mid[i] * 0.15 +
                    fin[i] * 0.15 +
                    quiz[i] * 0.10 +
                    report[i] * 0.40 +
                    attend[i] * 0.20;

            System.out.println();
        }


        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (wavg[i] < wavg[j]) {


                    double tmpD = wavg[i];
                    wavg[i] = wavg[j];
                    wavg[j] = tmpD;


                    String tmpS;

                    tmpS = id[i];    id[i] = id[j];    id[j] = tmpS;
                    tmpS = name[i];  name[i] = name[j];  name[j] = tmpS;

                    int tmpI;
                    tmpI = mid[i];     mid[i] = mid[j];       mid[j] = tmpI;
                    tmpI = fin[i];     fin[i] = fin[j];       fin[j] = tmpI;
                    tmpI = quiz[i];    quiz[i] = quiz[j];     quiz[j] = tmpI;
                    tmpI = report[i];  report[i] = report[j]; report[j] = tmpI;
                    tmpI = attend[i];  attend[i] = attend[j]; attend[j] = tmpI;
                }
            }
        }


        System.out.println("\n====== JAVA 성적 결과 (가중 평균 내림차순) ======");
        System.out.println("학번\t이름\t중간\t기말\t퀴즈\t레포트\t출석\t가중평균");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%d\t%.2f\n",
                    id[i], name[i], mid[i], fin[i], quiz[i], report[i], attend[i], wavg[i]);
        }

    }
}