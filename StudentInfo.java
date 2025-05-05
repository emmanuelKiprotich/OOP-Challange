import java.util.Scanner;

class StudentInfo {
    Scanner scanner = new Scanner(System.in);  // Create Scanner object

    public void readStudentDetails() {
        int age;
        String name;
        String course;

        System.out.print("Age? ");
        age = scanner.nextInt();
        scanner.nextLine(); // Clear the leftover newline

        System.out.print("Name? ");
        name = scanner.nextLine();  // Now this works

        System.out.print("Course name? ");
        course = scanner.nextLine();  // Also supports spaces

        System.out.println("Hello " + name + ", you are " + age + " years old and enrolled in " + course + ".");
    }

    public static void main(String[] args) {
        new StudentInfo().readStudentDetails();
    }
}
