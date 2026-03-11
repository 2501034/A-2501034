import java.io.IOException;
import java.util.Scanner;

public class Input {
    public static void DataRead(String[][][] students, int[][][] subject) throws IOException {
        Scanner keyboard = new Scanner(System.in);

        for (int ban = 0; ban < students.length; ban++) {
            System.out.println("\n▶ " + (ban + 1) + "반 점수 입력");

            for (int i = 0; i < students[ban].length; i++) {
                String name = students[ban][i][1];
                String gender = students[ban][i][2];

                System.out.println("\n학생 : " + name);


                while (true) {
                System.out.print("국어: ");
                subject[0][ban][i] = keyboard.nextInt();
                    if (subject[0][ban][i] >= 0 && subject[0][ban][i] <= 100)
                        break;
                    else {
                        System.err.println("ERROR");
                        System.in.read();
                    }
                }

                while (true) {
                System.out.print("영어: ");
                subject[1][ban][i] = keyboard.nextInt();
                    if (subject[1][ban][i] >= 0 && subject[1][ban][i] <= 100)
                        break;
                    else {
                        System.err.println("ERROR");
                        System.in.read();
                    }
                }

                while (true) {
                System.out.print("수학: ");
                subject[2][ban][i] = keyboard.nextInt();
                    if (subject[2][ban][i] >= 0 && subject[2][ban][i] <= 100)
                        break;
                    else {
                        System.err.println("ERROR");
                        System.in.read();
                    }
                }

                while (true) {
                if (gender.equals("남"))
                    System.out.print("기술: ");
                else
                    System.out.print("가사: ");

                subject[3][ban][i] = keyboard.nextInt();
                    if (subject[3][ban][i] >= 0 && subject[3][ban][i] <= 100)
                        break;
                    else {
                        System.err.println("ERROR");
                        System.in.read();
                    }
                }

            }
        }
    }
}
