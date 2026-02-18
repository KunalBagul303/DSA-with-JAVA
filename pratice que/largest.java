
public class largest {

    public static int largestnum(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
    }


    public static void main(String[] args) {
        int numbers[] = {2,3,4,6,7,8,9,10};

        System.out.println(largestnum(numbers));
    }
}
