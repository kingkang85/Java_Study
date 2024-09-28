package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        // Continue
        // For 문
        int max = 20;
        int sold = 0;
        int noShow = 17;
        for (int i = 1; i <= 50 ; i++) {
            System.out.println(i + "번 손님, 주문하신 방구 나왔습니다.");

            if (i == noShow) {
                System.out.println(i + "번 손님, OUT.");
                continue;
            }

            sold++;
            if (sold == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료합니다.");

        // While 문
        int index = 1;
        sold = 0;
        while (index <= 30) {
            System.out.println(index + "번 손님, 주문하신 피자 나왔습니다.");

            if (index == noShow) {
                System.out.println(index + "번 손님, 노쇼 에바!");
                index++;
                continue;
            }

            sold++;
            if (sold == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
            index++;
        }
        System.out.println("영업을 종료합니다.");
    }
}
