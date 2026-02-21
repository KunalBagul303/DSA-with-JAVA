
public class onerec {

    public static void onerecarsion(int n){
        if(n == 1){
            System.out.print(n);
            return;
        }
        System.out.println(n);
        onerecarsion(n-1);
    }


    public static void main(String[] args) {
        int n  = 10;
        onerecarsion(n);
    }
}
