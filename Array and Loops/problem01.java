//Sum and Average: Calculate total sum and arithmetic mean of an integer array
public class problem01 {
    public static void main(String[] args) {
        int sum = 0;
        double arithmeticMean = 0;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for(int i=0; i<10; i++) {
            sum = sum + arr[i];
        }

        arithmeticMean = (double) sum/arr.length;
        System.out.println("Sum is " + sum);
        System.out.println("Arithmetic Mean is " + arithmeticMean);

    }
}
