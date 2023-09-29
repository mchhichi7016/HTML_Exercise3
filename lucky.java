public class Main {
    public static void main(String[] args) {

        int lucky[] = {24, -56, 90, -18, -45, 29, 91};
        int cumulative[] = new int[lucky.length];

        for (int i = 0; i < lucky.length - 1; i++) {
            cumulative[i] = lucky[i] + lucky[i + 1];
        }

        // 计算 cumulative 数组的最后一个元素
        cumulative[lucky.length - 1] = lucky[lucky.length - 1];

        for (int i = 0; i < cumulative.length; i++) {
            System.out.println(cumulative[i]);
        }
    }
}
