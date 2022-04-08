package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DiagonalDifferent {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int leftDiagonalIndexStart=0;
        int rightDiagonalIndexStart=arr.size()-1;
        int increaseIndexLeft=arr.size()+1;
        int increaseIndexRight=arr.size()-1;
        List<Integer> newArr=arr.stream().flatMap(List::stream).collect(Collectors.toList());
        int sumLeft=0;
        int sumRight=0;
        for (int i = 0; i < newArr.size(); i+=increaseIndexLeft) {
            sumLeft+=newArr.get(i);


        }
        for (int i = rightDiagonalIndexStart; i <newArr.size(); i+=increaseIndexRight) {
            sumRight+=newArr.get(i);
        }
        sumRight-=newArr.get(newArr.size()-1);
        return Math.abs(sumLeft-sumRight);

    }
    public static void main(String[] args) {
        List<List<Integer>> matrix = new ArrayList<>();
        List<Integer> row1 = new ArrayList<>(List.of(1,2,3));
        List<Integer> row2 = new ArrayList<>(List.of(4,5,6));
        List<Integer> row3 = new ArrayList<>(List.of(9,8,9));
        matrix.add( row1 );
        matrix.add( row2 );
        matrix.add( row3 );

        System.out.println(diagonalDifference(matrix));
    }
}
