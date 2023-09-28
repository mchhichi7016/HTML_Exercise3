public class Main {
    public static void main(String[] args){

        //求1+1/2+1/3+...+1/100

        double sum = 0.0;

        for (int i = 1; i <= 100; i++) {
            sum += 1.0 / i;
        }

        System.out.println(sum);


    }
}
