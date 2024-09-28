package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        // 문자열의 길이
        System.out.println(s.length()); // 29

        // 대소문자 변환
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        // 포함 관계
        System.out.println(s.contains("Java")); // true
        System.out.println(s.contains("C#a")); // false
        System.out.println(s.indexOf("Java")); // 시작 위치 정보 => 7
        System.out.println(s.indexOf("C#")); // 포함되지 않는다면 -1
        System.out.println(s.lastIndexOf("and")); // 23
        System.out.println(s.startsWith("I like")); // true
        System.out.println(s.endsWith(".")); // true
    }
}
