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
            System.out.println("--- 2D Analisis de coordenadas ---");
            System.out.println("Ingrese coordenadas (X Y). Ingrese 0 0 para realizar el proceso.");
            while (true) {
                System.out.print("Ingrese punto (x y): ");
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                
                if (x == 0 && y == 0) {
                    break;
                }
                
                if (x < 0 && y < 0) {
                    System.out.println("-> punto (" + x + ", " + y + ") está en el tercer cuadrante y será ignorado.");
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
                System.out.println("Más cercano al origen: " + closestX + " " + closestY);
                System.out.println("Más lejano del origen: " + furthestX + " " + furthestY);
                System.out.println("Distancia media del origen: " + averageDistance);
            } else {
                System.out.println("No se ingresaron puntos válidos.");
            }
        }
    }
}