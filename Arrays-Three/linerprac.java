public class linerprac {
    
    public static int linear(int numbers[],int key){
        for(int i=0; i<=numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }  
        }
        return -1;
    }

    public static void main(String[] args) {
        

        int numbers[] = {3,4,5,6,7,8,5,4,2};
        int key = 8;
        int index = linear(numbers, key);
        if(index == -1){
            System.out.print("not found");
        }else{
            System.out.print("found this key : " + index);
        }
    } 
}
