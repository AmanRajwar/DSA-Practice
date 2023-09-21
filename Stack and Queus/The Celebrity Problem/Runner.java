public class Runner {
    // Define a 2D array to represent knowledge
    private static boolean[][] knowledge;

    // Initialize the knowledge matrix with known relationships
    public static void initializeKnowledge(int n, int[][] relationships) {
        knowledge = new boolean[n][n];
        for (int[] relationship : relationships) {
            int personA = relationship[0];
            int personB = relationship[1];
            knowledge[personA][personB] = true;
        }
    }

    // Function to check if person A knows person B
    public static boolean knows(int A, int B) {
        return knowledge[A][B];
    }

    public static void main(String[] args) {
        // Example usage:
        int n = 5; // Number of people
        int[][] relationships = {
            {0, 4}, // Person 0 knows Person 1
            {1, 4}, // Person 1 knows Person 2
            {2, 4},  // Person 2 knows Person 3
            {3, 4}  // Person 3 knows Person 4
        };

        // Initialize the knowledge matrix
        initializeKnowledge(n, relationships);

        // Find the celebrity using the provided code
        int celebrity = optimal.findCelebrity(n);

        if (celebrity != -1) {
            System.out.println("The celebrity is person " + celebrity);
        } else {
            System.out.println("No celebrity found.");
        }
    }
}
