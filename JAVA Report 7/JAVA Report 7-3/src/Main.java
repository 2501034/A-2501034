public class Main {
    public static void main(String[] args) {
        int day = 55;
        int night = 13;
        int fall = 300;
        int climbing;
        int during = 0;

        /* for (during = 1; during <= 7; during++) {
            climbing = ((day - night) * during);
            if (during >= 7) {
                if (fall <= climbing) {
                    System.out.println("다 올라왔습니다. 방울꽃 곁을 지켰습니다.");
                } else {
                    System.out.println("못 올라왔습니다. 방울꽃 곁을 지키지 못하였습니다.");
                }
            }
        } */

         /* while (during <= 7) {
            climbing = ((day - night) * during);
            if (during >= 7) {
                if (fall <= climbing) {
                    System.out.println("다 올라왔습니다. 방울꽃 곁을 지켰습니다.");
                } else {
                    System.out.println("못 올라왔습니다. 방울꽃 곁을 지키지 못하였습니다.");
                }
            }
            during++;
        } */

         do {
            climbing = ((day - night) * during);
            if (during >= 7) {
                if (fall <= climbing) {
                    System.out.println("다 올라왔습니다. 방울꽃 곁을 지켰습니다.");
                } else {
                    System.out.println("못 올라왔습니다. 방울꽃 곁을 지키지 못하였습니다.");
                }
            }
            during++;
        } while (during <= 7);
    }
}