public class Main {
    public static void main(String[] args) {

        int n = 4567;
        int digit[] = new int[4];

        for (int i = 0; i < 4; i++) {
            int y = n % 10;
            digit[3 - i] = y; // 存储在逆序位置

            int q = n / 10;
            n = q;
        }

        for (int i = 0; i < digit.length; i++) {
            System.out.println(digit[i]);
        }
    }
}
