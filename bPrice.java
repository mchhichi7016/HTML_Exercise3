public class Main {
    public static void main(String[] args){

        double bPrice = 0.1;

        if (bPrice >= 3){
            System.out.println("不买了");
        } else if (bPrice >= 2 && bPrice < 3) {
            System.out.println("买3个");
        } else if (bPrice >= 1 && bPrice < 2) {
            System.out.println("买5个");
        } else if (bPrice >= 0.5 && bPrice <1) {
            System.out.println("买8个");
        }
        else {
            System.out.println("买10个");
        }
    }
}
