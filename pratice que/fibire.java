public class fibire {

    public static int fibic(int n){
        if(n==1 || n==0){
            return 1;
        }
        int fnm1 = fibic(n-1);
        int fnm2 = fibic(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fibic(n));
    }
}
