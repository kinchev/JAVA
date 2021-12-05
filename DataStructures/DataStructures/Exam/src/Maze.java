import java.util.*;



public class Maze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split(" ");
        int m = Integer.parseInt(line[0]);
        int n = Integer.parseInt(line[1]);



        int[][] maze = new int[m][n];



        for (int i = 0; i < m; i++) {
            String[] input = scanner.nextLine().split("");
            for (int j = 0; j < n; j++) {
                maze[i][j] = Integer.parseInt(input[j]);
            }
        }



        List<Integer> list = new ArrayList<>();
        boolean[][] visited = new boolean[m][n];
        int maxCells = 0;



        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(maze[i][j] == 0) {
                    continue;
                }
                if (visited[i][j]) {
                    continue;
                }
                int count = solve(maze, visited, i, j, maze[i][j]);
                list.add(count);
                maxCells = Math.max(maxCells, count);
            }
        }
        Collections.sort(list, Collections.reverseOrder());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }



    private static int solve(int[][] matrix, boolean[][] visited, int i, int j, int currentValue) {
        if (outOfMaze(matrix, i, j)) {
            return 0;
        }



        if (visited[i][j]) {
            return 0;
        }



        if (matrix[i][j] != currentValue) {
            return 0;
        }



        visited[i][j] = true;



        return solve(matrix, visited, i - 1, j, currentValue) +
                solve(matrix, visited, i + 1, j, currentValue) +
                solve(matrix, visited, i, j - 1, currentValue) +
                solve(matrix, visited, i, j + 1, currentValue) + 1;
    }



    private static boolean outOfMaze(int[][] matrix, int i, int j) {
        return i >= matrix.length || i < 0 || j >= matrix[i].length || j < 0;
    }
}