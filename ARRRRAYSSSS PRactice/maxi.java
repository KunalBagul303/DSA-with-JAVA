public class maxi {

    public static int[] getnepos(int[] arr) {
        int negative = 0;
        int postive = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                postive = postive + arr[i];
            } else {
                negative = negative + arr[i];
            }
        }
        int ans[] = { postive, negative };
        return ans;
    }




    public static int[] zeroone(int[] arr) {
        int zero = 0;
        int one = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zero++;
            } else {
                one--;
            }
        }
        int ans[] = { zero, one };
        return ans;
    }



    public static int maxi(int[] arr) {
        int maxi = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxi) {
                maxi = arr[i];
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        int[] arr = { 1,1,0,0,0,1,1,0,0,1,0 };

        // int ans = maxi(arr);
        // System.out.println(ans);

        int[] ans = zeroone(arr);
        System.out.println("zero sum = " + ans[0]);
        System.out.println("one sum = " + ans[1]);

    }

}
