public class Main {
    public static void main(String[] args){

        int x = 0;
        while (true){
            if (x % 3 == 2 && x % 5 == 3 && x % 7 == 2){
                System.out.println(x);
                break;
            }
            x++;
        }

    }
}
