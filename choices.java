public class choices {
    public static void main(String[] args) {
        int marks = 78; // Change this value to test different grades

        if (marks >= 70) {
            System.out.println("Pass with first class");
        } else if (marks >= 60) {
            System.out.println("Pass with second class upper division");
        } else if (marks >= 50) {
            System.out.println("Pass with second class lower division");
        } else if (marks >= 40) {
            System.out.println("Pass");
        } else {
            System.out.println("Grade: F (Fail)");
        }
    }

}
