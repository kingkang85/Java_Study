package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        int height = 123;
        String pass = (height >= 120) ? "가능" : "불가능";
        System.out.println("키가 " + height + "cm 이므로 탑승 " + pass + "합니다.");
    }
}
