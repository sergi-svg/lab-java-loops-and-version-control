import java.util.Arrays;

public class MathUtils {

    public static void main(String[] args) {
        int[] arrayOfIntegers = {12, 1, 21, 8, 55, 7, 89};

        // Task 1
        try {
            System.out.printf("The difference between the largest and smallest values is: %d%n", differenceBetweenLargestAndSmallestOfAnArrayOfIntegers(arrayOfIntegers));
            System.out.printf("The difference between the largest and smallest values is: %d%n", differenceBetweenLargestAndSmallestOfAnArrayOfIntegers(new int[]{}));
        } catch (Exception e) {
            System.out.println(e);
        }


        // Task 2
        printTheSmallestValuesOfAnArrayOfIntegers(arrayOfIntegers, 2);
        printTheSmallestValuesOfAnArrayOfIntegers(new int[]{}, 0);

        // Task 3
        System.out.printf("The result of the operation x^2 * ( 4 * y/5 - x)^2 for x = %d and y = %d is: %.2f%n", 9, 3, calculateOperation(9, 3));
    }

    private static int differenceBetweenLargestAndSmallestOfAnArrayOfIntegers(int[] arrayOfIntegers) throws Exception {
        if (arrayOfIntegers.length < 1) throw new Exception("The length of the array must be at least 1.");
        return Arrays.stream(arrayOfIntegers).max().getAsInt() - Arrays.stream(arrayOfIntegers).min().getAsInt();
    }

    private static void printTheSmallestValuesOfAnArrayOfIntegers(int[] arrayOfIntegers, int numberOfSmallestValuesToPrint) {
        if (arrayOfIntegers.length < numberOfSmallestValuesToPrint)
            System.out.println("The number of smallest values to print is bigger than the length of the array");
        else if (numberOfSmallestValuesToPrint <= 0)
            System.out.println("The number of the smallest values to print must be a positive number");
        else
            System.out.println(
                    Arrays.toString(
                            Arrays.copyOfRange(Arrays.stream(arrayOfIntegers).sorted().toArray(), 0, numberOfSmallestValuesToPrint)));
    }

    /**
     * Operation
     *
     * @params int x, y
     * return x^2 + (4y/5 - x)^2
     */
    private static double calculateOperation(int x, int y) {
        return Math.pow(x, 2) + Math.pow(((4 * y) / 5 - x), 2);
    }
}
