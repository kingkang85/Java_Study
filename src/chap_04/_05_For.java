package chap_04;

public class _05_For {
    public static void main(String[] args) {
        // 반복문 For
        for (int i = 0; i < 10; i++) {
            System.out.println("어서오세오. 샤넬입니다." + i);
        }

        // 짝수만 출력
        for (int i = 0; i <= 10; i += 2) {
            System.out.print(i); // 0246810
        }

        System.out.println();
        // 홀수만 출력
        for (int i = 1; i <= 10 ; i += 2) {
            System.out.print(i); // 13579
        }

        System.out.println();
        // 거꾸로 출력
        for (int i = 5; i > 0; i--) {
            System.out.print(i); // 54321
        }

        System.out.println();
        // 1 + 2 + ... + 10 == ?
        int sum = 0;
        for (int i = 1; i <= 10 ; i++) {
            sum += i;
        }
        System.out.println(sum); // 55
    }
}
