package Arithmetic.Arithmetic;

public class Sum {
    public static int Sum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + Sum(n - 1);
        }
    }


public static void main(String[] args) {
    int result = Sum(5);
    System.out.println("Sum: " +result);
}
}