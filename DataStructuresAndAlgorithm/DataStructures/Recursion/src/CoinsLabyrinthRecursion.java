/*Scrooge McDuck likes his treasure very much. That is why he likes to play a funny game.

He builds a labyrinth of coins and tries to escape from it. You can think of the labyrinth as a rectangular field. Each cell of the field contains 0 or more coins.

When Scrooge McDuck steps on a cell, he can take only a single coin from this cell, and only if there are any coins. Scrooge McDuck can escape the field, only if he is surrounded by empty cells.

Scrooge McDuck always wants to go to the neighbouring cell with most coins. BUT if there are more than one cells with the same amount of coins (the largest), he chooses a cell (always the largest) from the order left, right, up, down

If Scrooge McDuck cannot go in any direction, he is out of the labyrinth*/


import java.util.Scanner;

public class CoinsLabyrinthRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int[][] maze = new int[rows][cols];
//        int startRow = 0;
//        int startCol = 0;
        int[] startPoint = new int[2];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                int tempValue = scanner.nextInt();
                maze[row][col] = tempValue;


                if (tempValue == 0) {
//                    startRow = i;
//                    startCol = j;
                    startPoint[0] = row;
                    startPoint[1] = col;

                }
            }
        }
        int[] coins = {0};
        solveLabyrinth(maze, coins, startPoint);
        System.out.println(coins[0]);

    }


    private static void solveLabyrinth(int[][] maze, int[] coins, int[] cell) {
        int[] nextCell = calculateNextCell(maze, cell[0], cell[1]);
        if (nextCell[0] == -1 && nextCell[1] == -1) {
            return;
        }
        coins[0]++;
        maze[nextCell[0]][nextCell[1]]--;
        solveLabyrinth(maze, coins, nextCell);

    }

    private static int[] calculateNextCell(int[][] maze, int row, int col) {
        int leftCoins = getCoins(maze, row, col - 1);
        int rightCoins = getCoins(maze, row, col + 1);
        int upCoins = getCoins(maze, row - 1, col - 1);
        int downCoins = getCoins(maze, row + 1, col - 1);
        int maxCoins = getMaxCoins(leftCoins, rightCoins, upCoins, downCoins);
        if (maxCoins == 0) {
            return new int[]{-1, -1};

        }
        if (maxCoins == leftCoins) {
            return new int[]{row, col - 1};
        }

        if (maxCoins == rightCoins) {
            return new int[]{row, col + 1};

        }

        if (maxCoins == upCoins) {
            return new int[]{row - 1, col};

        }


        return new int[]{row + 1, col};


    }

    //private static int getMaxCoins(int...coins)
    private static int getMaxCoins(int... coins) {

        int maxCoins = 0;
        for (int coin : coins) {
            if (coin > maxCoins) {
                maxCoins = coin;
            }
        }
        return maxCoins;
    }

    private static int getCoins(int[][] maze, int row, int col) {
        return outOfMaze(maze, row, col) ? 0 : maze[row][col];
    }

    private static boolean outOfMaze(int[][] maze, int row, int col) {
        return row >= maze.length || row < 0 || col >= maze[row].length || col < 0;
    }
}
