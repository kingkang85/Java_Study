package chap_06;

public class _Quiz_06 {
    public static String getHiddenData(String data, int idx) {
        String hiddenData = data.substring(0, idx);
        for (int i = 0; i < data.length() - idx; i++) {
            hiddenData += "*";
        }
        return hiddenData;
    }

    public static void main(String[] args) {
        String name = "강지민";
        String id = "010805-1234567";
        String phone = "010-1234-5678";

        System.out.println("이름 : " + getHiddenData(name, 1));
        System.out.println("주민등록번호 : " + getHiddenData(id, 8));
        System.out.println("전화번호 : " + getHiddenData(phone, 9));
    }
}
