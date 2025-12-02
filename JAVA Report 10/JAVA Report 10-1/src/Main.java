public class Main {
    public static void main(String[] args) {
        int [] numbers;
        int result;

        numbers = Input.readData();

        result = Compute.max(numbers);

        Output.display(result);

    }
}