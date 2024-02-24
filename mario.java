import java.util.Scanner;

public class MiniMarioGame {
    public static void main(String[] args) {
        // Define the grid size
        final int GRID_SIZE = 5;
        
        // Create a 2D array to represent the grid
        char[][] grid = new char[GRID_SIZE][GRID_SIZE];
        
        // Initialize the grid with empty spaces
        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                grid[i][j] = '-';
            }
        }
        
        // Set the initial position of Mario
        int marioRow = 0;
        int marioCol = 0;
        grid[marioRow][marioCol] = 'M';
        
        // Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Game loop
        while (true) {
            // Display the grid
            for (int i = 0; i < GRID_SIZE; i++) {
                for (int j = 0; j < GRID_SIZE; j++) {
                    System.out.print(grid[i][j] + " ");
                }
                System.out.println();
            }
            
            // Prompt the user for input
            System.out.print("Enter move (W/A/S/D): ");
            char move = scanner.next().charAt(0);
            
            // Move Mario based on user input
            switch (move) {
                case 'W': // Move up
                    if (marioRow > 0) {
                        grid[marioRow][marioCol] = '-';
                        marioRow--;
                        grid[marioRow][marioCol] = 'M';
                    }
                    break;
                case 'A': // Move left
                    if (marioCol > 0) {
                        grid[marioRow][marioCol] = '-';
                        marioCol--;
                        grid[marioRow][marioCol] = 'M';
                    }
                    break;
                case 'S': // Move down
                    if (marioRow < GRID_SIZE - 1) {
                        grid[marioRow][marioCol] = '-';
                        marioRow++;
                        grid[marioRow][marioCol] = 'M';
                    }
                    break;
                case 'D': // Move right
                    if (marioCol < GRID_SIZE - 1) {
                        grid[marioRow][marioCol] = '-';
                        marioCol++;
                        grid[marioRow][marioCol] = 'M';
                    }
                    break;
                default:
                    System.out.println("Invalid move!");
            }
        }
    }
}
