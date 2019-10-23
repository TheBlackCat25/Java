/**
 * factorial
 */
public class factorial {

    public static void main(String[] args) {
        int res = 1;
        int num = Integer.parseInt(System.console().readLine());
        for (int i = num; i>0; i--){
            res = res * i;
        }
        System.out.println(res);
    }
}