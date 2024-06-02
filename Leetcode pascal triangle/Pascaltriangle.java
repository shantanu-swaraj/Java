//package Leetcode_pascal_triangle;
import java.util.*;

public class Pascaltriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();//1st error

        if (numRows == 0) return triangle;

        List<Integer> first_row = new ArrayList<>();
        first_row.add(1);
        triangle.add(first_row);

        for (int i = 1; i < numRows; i++) {
            List<Integer> prev_row = triangle.get(i - 1);//2nd error
            List<Integer> row = new ArrayList<>();//3rd error

            row.add(1);
            for (int j = 1; j < i; j++) {
                row.add(prev_row.get(j - 1) + prev_row.get(j));//4th error
            }
            row.add(1);
            triangle.add(row);
        }
        return triangle;
    }

    public static void main(String[] args) {
        Pascaltriangle pt = new Pascaltriangle();
        List<List<Integer>> result = pt.generate(10);
        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }
}
