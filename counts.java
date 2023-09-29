public class Main {
    public static void main(String[] args){

        int message[] = {24, 56, 90, 18, 45, 29, 91};
        int counts = 0;

        for (int i = 0; i < message.length; i++) {

            if (message[i] >= 20 && message[i] <= 30){
                counts ++;

            }
        }
        System.out.println(counts);
    }
}
