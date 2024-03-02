import java.util.Scanner;
//checkkkk
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square root");
            System.out.println("6. Factorial");
            System.out.println("7. Natural logarithm (base e)");
            System.out.println("8. Power function");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Exiting...");
                break;
            }

            double result = 0;
            switch (choice) {
                case 1:
                    result = add(scanner);
                    break;
                case 2:
                    result = subtract(scanner);
                    break;
                case 3:
                    result = multiply(scanner);
                    break;
                case 4:
                    result = divide(scanner);
                    break;
                case 5:
                    result = squareRoot(scanner);
                    break;
                case 6:
                    result = factorial(scanner);
                    break;
                case 7:
                    result = naturalLogarithm(scanner);
                    break;
                case 8:
                    result = power(scanner);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
            System.out.println("Result: " + result);
        }
        scanner.close();
    }

    public static double add(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        return num1 + num2;
    }

    public static double subtract(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        return num1 - num2;
    }

    public static double multiply(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        return num1 * num2;
    }

    public static double divide(Scanner scanner) {
        System.out.print("Enter dividend: ");
        double dividend = scanner.nextDouble();
        System.out.print("Enter divisor: ");
        double divisor = scanner.nextDouble();
        if (divisor == 0) {
            System.out.println("Error: Cannot divide by zero!");
            return Double.NaN; // NaN indicates an undefined value
        }
        return dividend / divisor;
    }

    public static double squareRoot(Scanner scanner) {
        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();
        return Math.sqrt(num);
    }

    public static double factorial(Scanner scanner) {
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int factorial = 1;
        for (int i = 2; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static double naturalLogarithm(Scanner scanner) {
        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();
        return Math.log(num);
    }

    public static double power(Scanner scanner) {
        System.out.print("Enter base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter exponent: ");
        double exponent = scanner.nextDouble();
        return Math.pow(base, exponent);
    }
}
