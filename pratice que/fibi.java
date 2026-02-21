
public class fibi {

    public static int fibinoc(int n ){
        if(n==0 || n==1){
            return 1;
        }
        int fnm1  = fibinoc(n-1);
        int fnm2 = fibinoc(n-2);
        int fn  = fnm1 + fnm2;
        return fn;
    }

    public static void main(String[] args) {
        int n  = 5;
        System.out.println(fibinoc(n));
    }
}
