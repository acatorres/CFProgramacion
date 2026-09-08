import java.util.Scanner;

public class QuadraticSolver {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Next you must enter the coefficients to calculate, for example: 1 -5 6 ");
            System.out.print("Enter coefficient a: ");
            double a = scanner.nextDouble();
            System.out.print("Enter coefficient b: ");
            double b = scanner.nextDouble();
            System.out.print("Enter coefficient c: ");
            double c = scanner.nextDouble();
            
            double discriminantSqrt = Math.sqrt(b * b - 4 * a * c);
            
            double root1 = (-b + discriminantSqrt) / (2 * a);
            double root2 = (-b - discriminantSqrt) / (2 * a);
            
            double minRoot = Math.min(root1, root2);
            double maxRoot = Math.max(root1, root2);
            System.out.println("The calculated roots are: " + minRoot + " and " + maxRoot);
        }
    }
}
