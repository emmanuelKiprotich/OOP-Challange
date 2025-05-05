import java.util.Scanner;

class ScannerExample {
    Scanner scanner = new Scanner(System.in);
    
    public void readNameAndAge() {
        String name;
        int age;
        
        // Read the entire line for name, allowing spaces
        System.out.print("Name? ");
        name = scanner.nextLine();  // Changed from scanner.next() to scanner.nextLine()
        
        // Read the age
        System.out.print("Age? ");
        age = scanner.nextInt();
        
        // Consume the remaining newline character
        scanner.nextLine();  // This line handles the leftover newline
        
        // Output the result
        System.out.println("Hello " + name + 
                         ", you are " + age + " years young!");
    }
    
    public static void main(String[] args) {
        (new ScannerExample()).readNameAndAge();
    }
}
