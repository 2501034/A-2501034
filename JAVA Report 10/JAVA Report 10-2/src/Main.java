public class Main {
    public static void main(String[] args) {
        int year;
        boolean result;

        year = Input.readData();

        result = Compute.leapyear(year);

        Output.display(year, result);
    }
}