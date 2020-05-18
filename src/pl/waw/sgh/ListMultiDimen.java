package pl.waw.sgh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListMultiDimen {
    // 1. Total sum of all elements
    public static int totalSum(List<List<Integer>> matrix) {
        int sum = 0;
        for (List<Integer> row : matrix) {
            for (Integer elem : row) {
                sum += elem;
            }
        }
        return sum;
    }
    // 2. Sum of each row
    public static int sumRow(List<List<Integer>> matrix, int rowIndex) {
        int sum = 0;
        List<Integer> row = matrix.get(rowIndex);
        for (Integer elem : row) {
            sum += elem;
        }
        return sum;
    }
    // 3. Sum of each column
    public static int sumColumn(List<List<Integer>> matrix, int colIndex) {
        int sum = 0;
        for (List<Integer> row : matrix) {
            sum += row.get(colIndex);
        }
        return sum;
    }

    public static void main(String[] args) {
        List<List<Integer>> myList2D = new ArrayList<>();
        List<Integer> row = Arrays.asList(new Integer[] { 46, 25, 466});
        myList2D.add(row);
        myList2D.add(Arrays.asList(new Integer[] {37768, 225, 251}));
        myList2D.add(Arrays.asList(new Integer[] {8935, 62, 324}));

        for (List<Integer> r : myList2D) {
            Integer[] arr = r.toArray(new Integer[0]);
            System.out.println(Arrays.toString(arr));
        }

        System.out.println("Total sum: " + totalSum(myList2D));
        System.out.println("Sum row 0: " + sumRow(myList2D, 0));
        System.out.println("Sum column 1: " + sumColumn(myList2D, 1));

    }
}
