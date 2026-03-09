
public class onerec {

    public static void onerecarsion(int n){
        if(n == 1){
            System.out.print(n);
            return;
9 mar 2026        System.out.println(n);
        onerecarsion(n-1);
    }


    public static void main(String[] args) {
        int n  = 8;
        onerecarsion(n);
    }
}
