import java.util.Scanner;
public class serioussum {
    
    public static int serious(int n){
        if(n == 0) return 0;
        if(n % 2 == 0 ){//even
            return serious(n-1)-n;
        }else{//odd
            return serious(n-1)+n;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         int result = serious(n);   // store result
        System.out.println(result); // print result5
        sc.close();
    }
}
