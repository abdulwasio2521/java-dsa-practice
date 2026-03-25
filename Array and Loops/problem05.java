public class problem05 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 456, 489, 298, 421, 23, 15};
        int target = 43;
        int indx;

        for(int i=0; i<arr.length; i++) {
            if(arr[i]==target) {
                indx = i;
                System.out.println("Index of " + target + " is " + i);
                return;
            }
        }
        System.out.println(target + " is not present in array: " + -1);

    }
}
