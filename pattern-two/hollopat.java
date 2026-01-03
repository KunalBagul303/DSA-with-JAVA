public class hollopat {
    public static void hollowpattern(int totRows, int totCol) {
        for(int i=1; i<=totRows; i++){
            for(int j=1; j<=totCol; j++){
                if(i==1 || i==totRows || j==1 || j==totCol){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }  

    public static void main(String[] args) {
        hollowpattern(5, 4);
    }
}
