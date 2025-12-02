public class Main {
    public static void main(String[] args) {
        long money;
        String hangul;

        money = Input.readData();

        hangul = Compute.covertHangul(money);

        Output.display(money,hangul);

    }
}