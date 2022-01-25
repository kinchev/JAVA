

public class MatrixElementSum {
    public static int solution(int[][] matrix) {
        int sum=0;
//        System.out.println(matrix.length);
//        System.out.println(matrix[0].length);
        if(matrix.length<=1){
            return sum=matrix[0][0];
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                sum+=matrix[i][j];
                if (matrix[i][j] == 0 && i<matrix.length-1) {
                    matrix[i+1][j]=0;
//                    if (i == 0) {
//                        points.add(new int[]{i + 1, j});
//                        points.add(new int[]{i + 2, j});
//                    } else if (i == 1) {
//                        points.add(new int[]{i + 1, j});
//
//                    }


                }

            }
        }
//        int sum = 0;
//
//       sum= Arrays.stream(Arrays.stream(matrix).flatMapToInt(IntStream::of).toArray()).sum();
//            for(int[] p:points){
//                int a=p[0];
//                int b=p[1];
//                sum-=matrix[a][b];
//
//            }
        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1}};
        System.out.println(solution(matrix));
    }
}
