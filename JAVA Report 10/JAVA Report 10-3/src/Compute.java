public class Compute {

    static final String[] hanNum = {"", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};
    static final String[] hanUnit = {"", "십", "백", "천"};      // 4자리 단위
    static final String[] bigUnit = {"", "만", "억", "조"};      // 4자리 블록 단위

    public static String read4Digits(int num4) {
        StringBuilder sb = new StringBuilder();

        // 4자리 문자열로 변환 (예: 25 → "0025")
        String s = String.format("%04d", num4);

        for (int i = 0; i < 4; i++) {
            int digit = s.charAt(i) - '0';
            if (digit != 0) {
                sb.append(hanNum[digit]).append(hanUnit[3 - i]);
            }
        }
        return sb.toString();
    }

    public static String covertHangul(long money) {

        if (money == 0)
            return "영원";

        StringBuilder result = new StringBuilder();
        int unitIndex = 0;

        while (money > 0) {
            int part = (int) (money % 10000);  // 4자리씩 끊기
            money /= 10000;

            if (part != 0) {
                String hangulPart = read4Digits(part);

                // 조, 억, 만 앞에는 띄어쓰기 추가
                if (result.length() > 0) {
                    result.insert(0, " ");
                }

                result.insert(0, hangulPart + bigUnit[unitIndex]);
            }

            unitIndex++;
        }
        result.append("원");
        return result.toString();
    }
}