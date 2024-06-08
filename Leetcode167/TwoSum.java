//import Leetcode_217.Duplicate;
/* 
public class Two_sum{
    public int[] twosum(int[] numbers, int target){
        int a_pointer=0;
        int b_pointer=numbers.length-1;

        while(a_pointer<=b_pointer){
            int sum=numbers[a_pointer]+numbers[b_pointer];

            if(sum>target){
                b_pointer-=1;
            }else if(sum<target){
                a_pointer+=1;
            }else{
                return new int[]{a_pointer+1,b_pointer+1};
            }
        }
        return new int[]{a_pointer+1,b_pointer+1};
    }
    public static void main(String[] args) {
        Two_sum two_sum = new twosum();
        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        int[] result = two_sum.twoSum(numbers, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}

*//* 
public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        int aPointer = 0;
        int bPointer = numbers.length - 1;

        while (aPointer < bPointer) {
            int sum = numbers[aPointer] + numbers[bPointer];

            if (sum > target) {
                bPointer -= 1;
            } else if (sum < target) {
                aPointer += 1;
            } else {
                return new int[]{aPointer + 1, bPointer + 1};  // Assuming 1-based indexing
            }
        }
        return new int[]{-1, -1};  // Return [-1, -1] if no solution is found
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] numbers = {2,4,7,6 ,8,11, 15};
        int target = 10;

        int[] result = twoSum.twoSum(numbers, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
  */

  import java.util.ArrayList;
import java.util.List;

public class TwoSum {
    public List<int[]> twoSum(int[] numbers, int target) {
        List<int[]> results = new ArrayList<>();
        int aPointer = 0;
        int bPointer = numbers.length - 1;

        while (aPointer < bPointer) {
            int sum = numbers[aPointer] + numbers[bPointer];

            if (sum > target) {
                bPointer -= 1;
            } else if (sum < target) {
                aPointer += 1;
            } else {
                results.add(new int[]{aPointer + 1, bPointer + 1});  // Assuming 1-based indexing
                aPointer += 1;  // Move both pointers to find next potential pair
                bPointer -= 1;
            }
        }
        return results;
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] numbers = {2,3, 4, 6, 7,9, 8, 11, 15};
        int target = 10;

        List<int[]> results = twoSum.twoSum(numbers, target);
        for (int[] result : results) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        }
    }
}
