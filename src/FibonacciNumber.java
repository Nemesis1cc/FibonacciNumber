import com.sun.tools.javac.Main;

public class FibonacciNumber {

    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 1;
        int n = 15;

        for (int i = 1; i < n-1; i++) {
            c = a + b;
            b = a;
            a = c;
        }

        System.out.print("Fibonacci number on " + n + " is:" + " " + c);
    }
}
