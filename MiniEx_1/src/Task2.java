import java.util.Scanner;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        runTask2();
    }

    public static void runTask2() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Part 1: Generate a 10x10 times table.
        int[][] multiplicationTable = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                multiplicationTable[i][j] = (i + 1) * (j + 1);
            }
        }

        // Part 2: Ask user how many questions they would like to answer
        System.out.print("How many questions would you like to answer? ");
        int numQuestions = scanner.nextInt();

        int correctAnswers = 0;

        // Part 3: Quiz loop
        for (int i = 0; i < numQuestions; i++) {
            int row = random.nextInt(10);
            int col = random.nextInt(10);

            int correctAnswer = multiplicationTable[row][col];
            System.out.print("What is " + (row + 1) + " x " + (col + 1) + " ? ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("Exactly! Great Job!");
                correctAnswers++;
            } else {
                System.out.println("Incorrect. The correct answer is " + correctAnswer);
            }
        }

        // Part 4: Output the brief summary
        int percentage = (int) Math.round(((double) correctAnswers / numQuestions) * 100);
        System.out.printf("You answered %d out of %d correctly. That's a percentage of %d%%.%n", correctAnswers, numQuestions, percentage);
    }
}
