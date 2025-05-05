    import java.util.Scanner;

public class WhileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("Enter numbers (negative number to stop):");

        number = scanner.nextInt();

        while (number >= 0) {
            System.out.println("You entered: " + number);
            number = scanner.nextInt(); // Ask again
        }

        System.out.println("Loop ended. Negative number entered.");
    }
}



