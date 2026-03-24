// Find Maximum and Minimum: Identify the highest and lowest numerical values in an array.
public class problem02 {
    public static void main(String[] args) {
        int[] arr = {50, 70, 100, 101, 1, -10, -54, 675, 462};

        int highestNum = arr[0];
        int lowestNum = arr[0];

        for(int i=0; i<arr.length; i++) {
            if(arr[i] > highestNum) {
                highestNum = arr[i];
            }
            if(arr[i] < lowestNum) {
                lowestNum = arr[i];
            }
        }

        System.out.println("Highest number is " + highestNum);
        System.out.println("Lowest number is " + lowestNum);
    }
}
