/*Description
Write a program that finds the largest possible sequence of equal neighboring elements in a rectangular matrix and prints its size.

Input:
On the first line you will receive the numbers N and M separated by a single space;
On the next N lines there will be M numbers separated with spaces - the elements of the matrix;
Output:
Print the size of the largest area of equal neighboring elements
Constraints:
3 <= N, M <= 1024
Sample tests
Input:
5 6
1 3 2 2 2 4
3 3 3 2 4 4
4 3 1 2 3 3
4 3 1 3 3 1
4 3 3 3 1 1
Output:
13
*/



import java.util.Scanner;

public class LargestSurfaceArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] maze = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                maze[row][col] = scanner.nextInt();

            }
        }
        boolean[][] visited = new boolean[rows][cols];
        int maxCells = 0;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (visited[row][col]) {
                    continue;
                }
                int count = explore(maze, visited, row, col, maze[row][col]);
                maxCells = Math.max(maxCells, count);


            }
        }
    }

    private static int explore(int[][] maze, boolean[][] visited, int row, int col, int current) {
        if (outOfMaze(maze, row, col)) {
            return 0;
        }
        if (visited[row][col]) {
            return 0;
        }
        if (maze[row][col] != current) {
            return 0;
        }
        visited[row][col] = true;
        return explore(maze, visited, row - 1, col, current) +
                explore(maze, visited, row + 1, col, current) +
                explore(maze, visited, row, col - 1, current) +
                explore(maze, visited, row, col + 1, current) + 1;
    }

    private static boolean outOfMaze(int[][] maze, int row, int col) {
        return row >= maze.length || row < 0 || col >= maze[0].length || col < 0;

    }
}
