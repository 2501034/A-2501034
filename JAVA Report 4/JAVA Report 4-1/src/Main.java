import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard =new Scanner(System.in);
        char input;
        char output;
        String result;

        System.out.print("문자 입력 : ");
        input = keyboard.next().charAt(0);

        output = ((input >= 'A' && input <= 'Z') || (input >= 'a' && input <= 'z')) ?
                ((input >= 'A' && input <= 'Z') ? (char)(input + 32): (char)(input - 32)): input;

        result = (input >= 'A' && input <= 'Z') ?
                String.format("입력 문자 %c는 대문자이고, 소문자로 변경하면 %c 입니다.", input, output):
                (input >= 'a' && input <= 'z') ?
                        String.format("입력 문자 %c는 소문자이고, 대문자로 변경하면 %c 입니다.", input, output):
                            String.format("영문자가 아닙니다.");

        System.out.print(result);
    }
}