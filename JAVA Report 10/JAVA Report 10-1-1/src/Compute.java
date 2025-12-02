public class Compute {
    public static int max(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    public static int max(int[] numbers) {
        int temp1 = max(numbers[0], numbers[1]);
        int temp2 = max(numbers[2], numbers[3]);
        return max(temp1, temp2);
    }

}
