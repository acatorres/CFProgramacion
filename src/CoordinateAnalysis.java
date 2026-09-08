import java.util.Locale;
import java.util.Scanner;

public class CoordinateAnalysis {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            int closestX = 0, closestY = 0;
            int furthestX = 0, furthestY = 0;
            double minDistance = Double.MAX_VALUE;
            double maxDistance = -1.0;
            double totalDistanceSum = 0.0;
            int validPointsCount = 0;
            System.out.println("--- 2D Coordinate Analysis ---");
            System.out.println("Enter coordinates (X Y). Enter 0 0 to finish processing.");
            while (true) {
                System.out.print("Ingrese punto (x y): ");
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                
                if (x == 0 && y == 0) {
                    break;
                }
                
                if (x < 0 && y < 0) {
                    System.out.println("-> Point (" + x + ", " + y + ") is in the third quadrant and will be ignored.");
                    continue;
                }
                
                double distance = Math.sqrt(x * x + y * y);
                
                if (distance < minDistance) {
                    minDistance = distance;
                    closestX = x;
                    closestY = y;
                }
                
                if (distance > maxDistance) {
                    maxDistance = distance;
                    furthestX = x;
                    furthestY = y;
                }
                
                totalDistanceSum += distance;
                validPointsCount++;
            }  
            System.out.println("\n--- Resumen de resultados ---");
            if (validPointsCount > 0) {
                double averageDistance = totalDistanceSum / validPointsCount;
                System.out.println("Closest to origin: " + closestX + " " + closestY);
                System.out.println("Furthest to origin: " + furthestX + " " + furthestY);
                System.out.println("Average distance to origin: " + averageDistance);
            } else {
                System.out.println("No valid points were entered.");
            }
        }
    }
}
