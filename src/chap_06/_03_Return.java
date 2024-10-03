package chap_06;

public class _03_Return {
    public static String getPhoneNumber() {
        String phoneNumber = "062-251-2743";
        return phoneNumber;
    }

    public static String getAddress() {
        return "광주광역시 어딘가";
    }

    public static String getActivities() {
        return "볼링장, 당구장, 노래방";
    }

    public static void main(String[] args) {
        // 반환값, Return
        String contactNumber = getPhoneNumber();
        System.out.println("호텔 전화번호 : " + contactNumber);

        String address = getAddress();
        System.out.println("호텔 주소 : " + address);

        System.out.println("호텔 액티비티 : " + getActivities());
    }
}
