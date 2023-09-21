
/*
	Time Complexity - O(N * M)
	Space Complexity - O(1)

	where N and M are the number of rows and columns of
	the grid respectively.
*/

import java.util.LinkedList;
import java.util.Queue;

public class optimal {

    public static int minTimeToRot(int[][] grid, int n, int m) {
        // Write your code here.
        Queue<int[]> q = new LinkedList<>();
        int countFresh = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    q.offer(new int[] { i, j });
                }
                if (grid[i][j] != 0) {
                    countFresh++;
                }
            }
        }

        if (countFresh == 0) {
            return 0;
        }

        int countSec = 0, countRot = 0;
        int dx[] = { 0, 0, 1, -1 };
        int dy[] = { 1, -1, 0, 0 };

        while (!q.isEmpty()) {
            int size = q.size();
            countRot += size;
            for (int i = 0; i < size; i++) {
                int curr[] = q.poll();

                for (int j = 0; j < 4; j++) {
                    int x = dx[j] + curr[0];
                    int y = dy[j] + curr[1];

                    if (x < 0 || y < 0 || x >= n || y >= m || grid[x][y] == 0 || grid[x][y] == 2)
                        continue;
                    grid[x][y] = 2;
                    q.offer(new int[] { x, y });
                }
            }
            if (q.size() != 0) {
                countSec++;
            }
        }
        return countFresh == countRot ? countSec : -1;
    }

}