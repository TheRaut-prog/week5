package week5;

import java.util.Arrays;

public class week5 {
    public static void main(String[] args) {
        // Define the input array
        int[] array = new int[] {2, 4, 6, 8, 10, 11};

        // Step 1: Count even numbers to determine new array size
        int count = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                count++;
            }
        }

        // Step 2: Create an array for even numbers
        int[] evenNumbers = new int[count];
        int index = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                evenNumbers[index++] = num;
            }
        }

        // Step 3: Print the result (even numbers array)
        System.out.println("Even numbers: " + Arrays.toString(evenNumbers));

        // Step 4: Using streams to find even numbers (alternative approach)
        int[] evenArray = Arrays.stream(array).filter(num -> num % 2 == 0).toArray();
        System.out.println("Even numbers (using streams): " + Arrays.toString(evenArray));

        // Step 5: Sum of even numbers
        int sumEven = Arrays.stream(evenArray).sum();
        System.out.println("Sum of even numbers: " + sumEven);

        // Step 6: Count the number of even numbers
        long countEven = Arrays.stream(evenArray).count();
        System.out.println("Number of even numbers: " + countEven);

        // Step 7: Sort the even numbers
        Arrays.sort(evenArray);
        System.out.println("Sorted even numbers: " + Arrays.toString(evenArray));
    }
}
