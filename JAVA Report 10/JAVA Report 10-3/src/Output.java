import java.text.DecimalFormat;

public class Output {
    public static void display(long money, String hangul) {
        DecimalFormat df = new DecimalFormat("#,###");
        String commaMoney = df.format(money);

        System.out.println(commaMoney + "는 " + hangul);
    }
}
