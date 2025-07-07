package Arithmetic.Arithmetic;

public class Factorial {
    
    public static int Factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + Factorial(n - 1);
        }
    }


public static void main(String[] args) {
    int result = Factorial(15);
    System.out.println("Sum: " +result);
}
}

