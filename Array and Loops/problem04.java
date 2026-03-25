public class problem04 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9, 10, 44, 45};
        int evenCount = 0;
        int oddCount = 0;

        for(int i=0; i<arr.length; i++) {
            if(arr[i]%2==0) {
                evenCount++;
            }
            else {
                oddCount++;
            }
        }

        System.out.println("Even Numbers are " + evenCount);
        System.out.println("Odd Numbers are " + oddCount);
    }
}
