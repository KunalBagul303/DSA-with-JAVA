

public class maxofarr {

    public static int Arraymaxnum(int n[]){
        int ans = n[0];
        for(int i=0; i<= n.length; i++){
            if(n[i] > ans){
                ans = n[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int n[] = {4,5,7,6,2,3,5,8,9,10,44,5,6,8};
        System.out.println(Arraymaxnum(n));
    }
}
