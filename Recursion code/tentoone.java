
public class tentoone {

    public static void Decending(int n){
        if(n == 1){
            System.out.println(1);
            return;
        }
        System.out.println(n+" ");
        Decending(n-1);
    }


    public static void main(String[] args) {
        int n = 10;
        Decending(n);
    }
}
