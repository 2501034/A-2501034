import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        String[][] employees = {{"홍길동","1111"},{"강민성","1241"},{"장원영","1251"},
                {"이동건","1571"},{"전현무","1871"},{"장영실","1178"},
                {"이순신","1346"},{"장보고","1187"},{"차은우","1465"},
                {"이정재","1462"}};

        char[] hobong = new char[] {'1','2','3','3','3','4','5','4','2','2'};
        int [][] sales = new int[employees.length][5]; //{기본급,업무수당,급여액,세금,지급액}'

        int i = 0;
        while (i < employees.length) {
            System.out.printf("%s 사원의 엄무수당 입력 : ",employees[i][0]);
            sales[i][1] = keyboard.nextInt();

            if (sales[i][1] >= 0 && sales[i][1] <= 1000000)
                i++;
            else {
                System.err.println("ERORR : 0 ~ 1,000,000");
                System.in.read();
            }
        }

        for (i = 0; i < employees.length; i++) {
            switch (hobong[i]) {
                case '1' :
                    sales[i][0] = 1650000;
                    break;
                case '2' :
                    sales[i][0] = 1680000;
                    break;
                case '3' :
                    sales[i][0] = 1700000;
                    break;
                case '4' :
                    sales[i][0] = 1720000;
                    break;
                case '5' :
                    sales[i][0] = 1750000;
                    break;
                default:
                    sales[i][0] = 0;
            }
        }

        for (i = 0; i < employees.length; i++) {
            sales[i][2] = sales[i][0] + sales[i][1];
        }

        for (i = 0; i < employees.length; i++) {
            if ( sales[i][2] >= 2600000) {
                sales[i][3] = (int) (sales[i][2] * (10.0f / 100));
            } else if (sales[i][2] >= 2000000) {
                sales[i][3] = (int) (sales[i][2] * (8.0f / 100));
            } else {
                sales[i][3] = (int) (sales[i][2] * (5.0f / 100));
            }
            sales[i][3] /= 100;
            sales[i][3] *= 100;
        }

        for (i = 0; i < employees.length; i++) {
            sales[i][4] = sales[i][2] - sales[i][3];
        }

        for (i = 0; i < employees.length - 1; i++) {
            // 마지막 i개는 이미 정렬되어 있음
            for (int j = 0; j < employees.length - 1 - i; j++) {
                if ( sales[j][4] >  sales[j + 1][4]) {
                    // swap
                    String[]  temp = employees[j];
                    employees[j] = employees[j + 1];
                    employees[j + 1] = temp;

                    char temp1 = hobong[j];
                    hobong[j] = hobong[j + 1];
                    hobong[j + 1] = temp1;

                    int[] salary = sales[j];
                    sales[j] = sales[j + 1];
                    sales[j + 1] = salary;
                }
            }
        }

        System.out.println("*******************************************");
        System.out.println(" 사번 이름 호봉 기본급 업무수당 급여액 세금 지급액 ");
        System.out.println("*******************************************");
        for (i = 0; i < employees.length; i++) {
            System.out.printf("%5s %3s %c %,9d %,9d %,9d %,8d %,9d\n",
                    employees[i][1],employees[i][0],hobong[i],
                    sales[i][0],sales[i][1],sales[i][2],sales[i][3],sales[i][4]);
        }
        System.out.println("*******************************************");
    }
}