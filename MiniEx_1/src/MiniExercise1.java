import java.util.Scanner;

public class MiniExercise1 {
    public static void main(String[] args) {
        Task1();
    }

    public static void Task1() {
        Scanner scanner = new Scanner(System.in);

        // Part 1: Ask the user how many elements they would like to create.
        System.out.print("Input the total number of elements: ");
        int numElements = scanner.nextInt();

        // Part 2: Create an Object array with X elements( X represents the value in Part 1)
        Object[] array = new Object[numElements];

        // Part 3: Loop to get user input for each element of the array
        for (int i = 0; i < numElements; i++) {
            System.out.print("Input a value for element " + (i + 1) + ": ");
            int value = scanner.nextInt();

            if (value == 0 || value == 1) {
                array[i] = (value == 1);
            } else if (value >= Byte.MIN_VALUE && value <= Byte.MAX_VALUE) {
                array[i] = (byte) value;
            } else if (value >= Short.MIN_VALUE && value <= Short.MAX_VALUE) {
                array[i] = (short) value;
            } else {
                array[i] = value;
            }
        }

        // Print the stored values
        System.out.println("Elements present in the array:");
        for (Object obj : array) {
            System.out.println(obj + " (" + obj.getClass().getSimpleName() + ")");
        }

        scanner.close();
    }
}
