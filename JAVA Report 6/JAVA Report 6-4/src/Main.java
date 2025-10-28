import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int korean,english,math;
        float avg;
        char grade;
        String result;

        System.out.print("국어, 영어. 수학 점수 입력 : ");
        korean = keyboard.nextInt();
        english = keyboard.nextInt();
        math = keyboard.nextInt();

        avg = (korean + english + math) / 3.0f;

        if (avg >= 90) {
            grade = 'A';
            result = "성적양호";
        } else if (avg >= 80) {
            grade = 'B';
            result = "성적양호";
        } else if (avg >= 70) {
            grade = 'C';
            result = "노력";
        } else if (avg >= 60) {
            grade = 'D';
            result = "노력";
        } else {
            grade = 'F';
            result = "성적불량";
        }

        System.out.println("===============================");
        System.out.println("국어  영어  수학  평균  학점  결과");
        System.out.printf("%d   %d  %d  %.2f    %c  %s\n"
                ,korean, english, math, avg, grade, result);
        System.out.println("===============================");
    }
}