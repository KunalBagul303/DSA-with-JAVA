

public class lineear {
    public static int linear_search(int numbers[], int key){

        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }    

    public static void main(String[] args) {
        int numbers[] = {2,3,4,5,6,7,8,9,10,11,12,13,14,16};
        int key = 5;

        int index = linear_search(numbers, key);
        if(index == -1){
            System.out.println("not found");
        }else{
            System.out.println("key is found :"+index);
        }
    }
}
