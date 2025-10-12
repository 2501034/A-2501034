import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int score;
        String grade;

        char A = 65;
        char B = 66;
        char C = 67;
        char D = 68;
        char F = 70;

        System.out.print("당신의 JAVA 점수 입혁 : ");
        score = keyboard.nextInt();

        grade = (score < 0 || score > 100) ? "점수 범위 벗어남":
                (score <= 100 && score >= 95) ? (A + "+") :
                        (score <= 94 && score >= 90) ? (A + "0") :
                                (score <= 89 && score >= 85) ? (B + "+") :
                                        (score <= 84 && score >= 80) ? (B + "0") :
                                                (score <= 79 && score >= 75) ? (C + "+") :
                                                        (score <= 74 && score >= 70) ? (C + "0") :
                                                                (score <= 69 && score >= 65) ? (D + "+") :
                                                                        (score <= 64 && score >= 60) ? (D + "0") :
                                                                                (score < 60 && score >= 0) ? F + "" : "";
        System.out.printf("입력 점수 : %d\n", score);
        System.out.printf("학점 : %s\n", grade);
    }
}