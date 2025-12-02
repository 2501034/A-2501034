public class Compute {
    public static boolean leapyear(int year) {
        if (year % 400 == 0)
            return true;      // 400의 배수 → 무조건 윤년
        else if (year % 100 == 0)
            return false;     // 100의 배수 → 평년
        else if (year % 4 == 0)
            return true;      // 4의 배수 → 윤년
        else
            return false;     // 나머지 → 평년
    }
}
