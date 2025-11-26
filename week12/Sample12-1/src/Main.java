import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int first;
        int second;
        int result;


        first = Input.readData("첫번째 데이터 입력 : ");
        second = Input.readData("두번째 데이터 입력 : ");

        result = Compute.add(first,second);

        Output.display(first,second,result);

    }







}