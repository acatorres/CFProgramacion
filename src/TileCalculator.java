import java.util.Scanner;


public class TileCalculator {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese la longitud de cada baldosa X (en metros): ");
            int x = scanner.nextInt();
            System.out.print("Ingrese la longitud del piso N (en metros): ");
            int n = scanner.nextInt();
            System.out.print("Ingrese el ancho del piso M (en metros): ");
            int m = scanner.nextInt();
            
            int tilesLength = (n + x - 1) / x;
            int tilesWidth = (m + x - 1) / x;
            
            int totalTiles = tilesLength * tilesWidth;
            System.out.println("La cantidad de baldosas requeridas es: " + totalTiles);
        }
    }
}