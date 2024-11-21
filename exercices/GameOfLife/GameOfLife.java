public class GameOfLife {
    private int[][] grid;
    private int rows;
    private int cols;

    // Constructeur pour initialiser la grille avec des dimensions données
    public GameOfLife(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.grid = new int[rows][cols];
    }

    // Initialiser la grille avec des valeurs aléatoires (0 pour mort, 1 pour vivant)
    public void initializeRandom() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = Math.random() < 0.5 ? 0 : 1;
            }
        }
    }

    // Compter les voisins vivants d'une cellule spécifique
    private int countLivingNeighbors(int x, int y) {
        int count = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (i == 0 && j == 0) continue; // Ignorer la cellule elle-même
                int nx = x + i;
                int ny = y + j;
                // Vérifier que la cellule voisine est dans les limites de la grille
                if (nx >= 0 && ny >= 0 && nx < rows && ny < cols) {
                    count += grid[nx][ny];
                }
            }
        }
        return count;
    }

    // Calculer l'étape suivante du jeu
    public void nextGeneration() {
        int[][] newGrid = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int livingNeighbors = countLivingNeighbors(i, j);

                // Appliquer les règles du jeu
                if (grid[i][j] == 1) { // La cellule est vivante
                    newGrid[i][j] = (livingNeighbors == 2 || livingNeighbors == 3) ? 1 : 0;
                } else { // La cellule est morte
                    newGrid[i][j] = (livingNeighbors == 3) ? 1 : 0;
                }
            }
        }

        // Mettre à jour la grille avec la nouvelle génération
        grid = newGrid;
    }

    // Afficher la grille
    public void displayGrid() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(grid[i][j] == 1 ? "■ " : "□ ");
            }
            System.out.println();
        }
    }

    // Méthode principale pour exécuter le jeu
    public static void main(String[] args) {
        GameOfLife game = new GameOfLife(10, 10);
        game.initializeRandom();

        // Boucle pour afficher les générations
        for (int generation = 0; generation < 10; generation++) {
            System.out.println("Génération " + generation + ":");
            game.displayGrid();
            game.nextGeneration();

            // Pause pour rendre la simulation plus lisible
            try {
                Thread.sleep(500); // Pause de 500 ms entre les générations
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
