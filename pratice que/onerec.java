
public class onerec {

    /**
     * @param n
     */
    public static void onerecarsion(int n){
        if(n == 1){
            System.out.print(n);
            return;
        onerecarsion(n-1);
    }


    public static void main(String[] args) {
        int n  = 8;
        onerecarsion(n);
    }
}
