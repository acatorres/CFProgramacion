import java.util.Scanner;


public class TileCalculator {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter tile side length X (in meters): ");
            int x = scanner.nextInt();
            System.out.print("Enter floor length N (in meters): ");
            int n = scanner.nextInt();
            System.out.print("Enter floor width M (in meters): ");
            int m = scanner.nextInt();
            
            int tilesLength = (n + x - 1) / x;
            int tilesWidth = (m + x - 1) / x;
            
            int totalTiles = tilesLength * tilesWidth;
            System.out.println("Minimum number of tiles required: " + totalTiles);
        }
    }
}
