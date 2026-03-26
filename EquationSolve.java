import java.util.*;
public class EquationSolve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a and b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = (int) Math.pow(a + b, 3);

        System.out.println("Result: " + result);

        sc.close();
    }
}

