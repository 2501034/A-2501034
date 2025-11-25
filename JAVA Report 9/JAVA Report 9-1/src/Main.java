import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner keyboard = new Scanner(System.in);
        final int BASIC_FEE = 1200;
        final int COUNT = 10;

        double[][] info = {
                {0, 0},       // 0번 없음
                {40, 0.05},   // 1 가정용
                {55, 0.035},  // 2 영업용
                {78, 0.025},  // 3 공장용
                {35, 0.015},  // 4 관공서
                {20, 0.0}     // 5 군기관
        };

        String[] typeName = {"", "가정용", "영업용", "공장용", "관공서", "군기관"};

        String[] num = new String[COUNT];
        String[] name = new String[COUNT];
        int[] type = new int[COUNT];
        double[] use = new double[COUNT];
        int[] useCost = new int[COUNT];
        int[] tax = new int[COUNT];
        int[] total = new int[COUNT];
        String[] memo = new String[COUNT];


        for (int i = 0; i < 10; i++) {

            System.out.print("번호 입력 (4자리): ");
            num[i] = keyboard.next();

            System.out.print("이름 입력: ");
            name[i] = keyboard.next();

            System.out.print("수도 구분(1~5): ");
            type[i] = keyboard.nextInt();

            System.out.print("사용량(m³): ");
            use[i] = Math.round(keyboard.nextDouble());

            useCost[i] = (int) (use[i] * info[type[i]][0]);

            tax[i] = (int) ((BASIC_FEE + useCost[i]) * info[type[i]][1]);
            tax[i] = (tax[i] / 10) * 10;

            total[i] = BASIC_FEE + useCost[i] + tax[i];

            memo[i] = (type[i] == 5 ? "일괄징수" : "");
            System.out.println();
        }

        System.out.println("                       수   도   요   금                     ");
        System.out.println("---------------------------------------------------------------------");
        System.out.printf("%-6s %-6s %-8s %-8s %-10s %-8s %-10s %-6s\n",
                "번호", "이름", "구분", "사용양", "사용금액", "TAX", "납부액", "비고");
        System.out.println("---------------------------------------------------------------------");

        for (int i = 0; i < COUNT; i++) {
            System.out.printf("%-6s %-6s %-8s %8.1f %,10d %,8d %,10d %-6s\n",
                    num[i],
                    name[i],
                    typeName[type[i]],
                    use[i],
                    useCost[i],
                    tax[i],
                    total[i],
                    memo[i]);
        }

        System.out.println("---------------------------------------------------------------------");

    }
}