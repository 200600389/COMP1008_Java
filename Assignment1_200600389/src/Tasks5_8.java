import java.util.Scanner;

public class Tasks5_8 {
    public static void main(String[] args) {
        task5();
    }

    // Task 5: Create array and call Task 6
    public static void task5() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        task6(array);
    }

    // Task 6: Fill array with values
    public static void task6(int[] array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter the value for element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        task7(array);
    }

    // Task 7: Print array values
    public static void task7(int[] array) {
        System.out.println("Array elements:");
        for (int value : array) {
            System.out.println(value);
        }
    }
}
