import java.util.Scanner;

// Tasks 1 & 2
public class Tasks1n2 {
    public static void main(String[] args) {
        task1();
        task2();
    }

    // Task 1: Arithmetic with if statements
    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter an operator (+, -, *, /, %, ^): ");
        char operator = scanner.next().charAt(0);

        if (operator == '+') {
            System.out.println("Answer: " + (num1 + num2));
        } else if (operator == '-') {
            System.out.println("Answer: " + (num1 - num2));
        } else if (operator == '*') {
            System.out.println("Answer: " + (num1 * num2));
        } else if (operator == '/') {
            System.out.println("Answer: " + (num1 / num2));
        } else if (operator == '%') {
            System.out.println("Answer: " + (num1 % num2));
        } else if (operator == '^') {
            System.out.println("Answe: " + Math.pow(num1, num2));
        } else {
            System.out.println("Operator not recognized");
        }
    }

    // Task 2: Arithmetic with switch statements
    public static void task2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter an operator (+, -, *, /, %, ^): ");
        char operator = scanner.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("Answer: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Answer: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Answer: " + (num1 * num2));
                break;
            case '/':
                System.out.println("Answer: " + (num1 / num2));
                break;
            case '%':
                System.out.println("Answer: " + (num1 % num2));
                break;
            case '^':
                System.out.println("Answer: " + Math.pow(num1, num2));
                break;
            default:
                System.out.println("Operator not recognized");
                break;
        }
    }
}
