package chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        int[] shoes = new int[10];

        int size = 250;
        for (int i = 0; i < shoes.length; i++) {
            shoes[i] = size;
            size += 5;
        }

        for (int shoe : shoes) {
            System.out.println("사이즈 " + shoe + " (재고 있음)");
        }
    }
}
