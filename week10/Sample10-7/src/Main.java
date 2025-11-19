import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);

        String[][] students = {{"2501002","홍길동"},{"2501003","이재명"},{"2501004","윤석열"},
                {"2501005","경복대",},{"2501006","오세훈"},{"2501007","강민성"},{"2501002","김시온"},
                {"2501022","이진우"},{"2501023","한정호"},{"2501032","니키타"}};
        int[][] score = new int[students.length][5]; //{국어,영어,수학,총점,등수}
        float[] avg = new float[students.length];

        boolean swapped = false;

        int i = 0;
        while (i < students.length) {
            System.out.printf("%s님의 국어 성적 입력 : ",students[i][1]);
            score[i][0] = keyboard.nextInt();
            System.out.printf("%s님의 영어 성적 입력 : ",students[i][1]);
            score[i][1] = keyboard.nextInt();
            System.out.printf("%s님의 수학 성적 입력 : ",students[i][1]);
            score[i][2] = keyboard.nextInt();

            if ((score[i][0] >= 0 && score[i][0] <= 100) &&
                    (score[i][1] >= 0 && score[i][1] <= 100) &&
                    (score[i][2] >= 0 && score[i][2] <= 100)) {
                i++;
            }else {
                System.err.println("ERORR : 0 ~ 100");
                System.in.read();
            }
            System.out.println();
        }

        for (i = 0; i < students.length; i++) {
            for (int j = 0; j < score[i].length - 2; j++) {
                score[i][score[i].length - 2] += score[i][j];
            }
        }

        /*   for (i = 0; i < name.length - 1; i++) {
            swapped = false;

            // 인접한 원소 비교 및 교환
            for (int j = 0; j < name.length - 1 - i; j++) {
                if (sum[j] < sum[j + 1]) {
                    // 자리 교환 (swap)
                    String text = stnum[j];
                    stnum[j] = stnum[j + 1];
                    stnum[j + 1] = text;

                    text = name[j];
                    name[j] = name[j + 1];
                    name[j + 1] = text;

                    int data = kor[j];
                    kor[j] = kor[j + 1];
                    kor[j + 1] = data;

                    data = eng[j];
                    eng[j] = eng[j + 1];
                    eng[j + 1] = data;

                    data = math[j];
                    math[j] = math[j + 1];
                    math[j + 1] = data;

                    data = sum[j];
                    sum[j] = sum[j + 1];
                    sum[j + 1] = data;

                    swapped = true;
                }
            }

            if (!swapped) break;
        } */

        for (i = 0; i < students.length; i++)
            avg[i] = score[i][score[i].length -2] / 3.0f;

        for (i = 0; i < students.length; i++) {
            score[i][score[i].length - 1] = 1;
            for (int j = 0; j < students.length; j++) {
                if (score[i][score[i].length -2] < score[j][score[j].length - 2])
                    ++score[i][score[i].length - 1];
            }
        }

        /*    for (i = 0; i < kor.length; i++) {
            rank[i] = i + 1;
        }

        for (i = 0; i < kor.length - 1; i++) {
            if (sum[i] == sum[i+1])
                rank[i + 1] = rank[i];
        } */




      /*  for (i = 0; i < name.length - 1; i++) {
            swapped = false;

            // 인접한 원소 비교 및 교환
            for (int j = 0; j < name.length - 1 - i; j++) {
                if (stnum[j].compareTo(stnum[j + 1]) > 0) {
                    // 자리 교환 (swap)
                    String text = stnum[j];
                    stnum[j] = stnum[j + 1];
                    stnum[j + 1] = text;

                    text = name[j];
                    name[j] = name[j + 1];
                    name[j + 1] = text;

                    int data = kor[j];
                    kor[j] = kor[j + 1];
                    kor[j + 1] = data;

                    data = eng[j];
                    eng[j] = eng[j + 1];
                    eng[j + 1] = data;

                    data = math[j];
                    math[j] = math[j + 1];
                    math[j + 1] = data;

                    data = sum[j];
                    sum[j] = sum[j + 1];
                    sum[j + 1] = data;

                    data = rank[j];
                    rank[j] = rank[j + 1];
                    rank[j + 1] = data;

                    float temp = avg[j];
                    avg[j] = avg[j + 1];
                    avg[j + 1] = temp;

                    swapped = true;
                }
            }
            // 교환이 한 번도 없으면 이미 정렬 완료 → 종료
            if (!swapped) break;
        } */

        System.out.println("**************************************");
        System.out.println(" 학번 이름 국어 영어 수학 총점 평균 등수 ");
        System.out.println("**************************************");
        for (i = 0; i < students.length; i++) {
            System.out.printf("%7s %3s %3d %3d %3d %3d %5.1f %2d\n",
                    students[i][0], students[i][1],
                    score[i][0], score[i][1], score[i][2], score[i][3], avg[i], score[i][4]);
        }
        System.out.println("**************************************");
    }
}