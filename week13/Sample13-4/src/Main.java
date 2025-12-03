import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        String[][] customers = new String[][] {{"1111","홍길동","1",""},
                {"2222","이순신","2",""},{"3333","장보고","3",""},
                {"4444","경복대","4",""},{"5555","김남국","5",""},
                {"1010","황철현","4",""},{"7777","이예린","2",""},
                {"1212","정성호","3",""},{"1313","조동국","5",""},
                {"1414","한민국","1",""}};

        for (int i = 0; i < customers.length; i++)
            Input.freeProcess(customers[i]);

        float[] used = Input.readData(customers);
        int[][] money = new int[customers.length][3]; //{사용요금,세금,징수금액}

        for (int i = 0; i < customers.length; i++) {
            Compute.pay(customers[i], used[i], money[i]);
        }
        Compute.tax(customers,money);

        for (int i = 0; i < money.length; i++)
            Compute.total(money[i]);

        Output.display(customers,used,money);
    }
}