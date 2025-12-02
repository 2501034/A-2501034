public class Output {
    public static void display(int year, boolean result) {
        if (result)
            System.out.println(year + "년은 윤년입니다.");
        else
            System.out.println(year + "년은 평년입니다.");
    }
}
