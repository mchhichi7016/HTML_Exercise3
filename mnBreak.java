public class Main {
    public static void main(String[] args){

        int n = 10;
        int m = 2;
        int res = 0;

        while (m >= 0 && n >= 0){
            res = Math.addExact(m ,n);
            if (res > 0){
                break;
            }
        }
        System.out.println(res);
    }
}
