import java.util.Scanner;

public class GetArrayMean{

    public static double getArrayMean(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }
  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = input.nextInt();

        int[] integers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            integers[i] = input.nextInt();
        }

        double mean = getArrayMean(integers);

        System.out.printf("The mean of the entered integers is: %.1f" , mean);

        input.close();
    }
}