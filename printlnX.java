public class Main {
    public static void main(String[] args){
        int x = 1;

        for (x = 1; x < 100; x++) {
            if (4 * x * x - 64 * x + 256 == 0){
                break;
            }
            System.out.println(x);
        }

        //System.out.println(x);
    }
}
