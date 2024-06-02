//package Leetcode_217;

/* 
METHOD NO.1

import java.util.HashSet;

public class Duplicate {
    public boolean hasDuplicate(int[] nums){
        HashSet<Integer> numbers=new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(numbers.contains(nums[i])){
                return true;
            } 

            numbers.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        Duplicate duplicateChecker = new Duplicate();
        int[] nums = {2, 3, 4, 5, 6, 7, 8, 1};  // Example array with a duplicate

        if (duplicateChecker.hasDuplicate(nums)) {
            System.out.println("The array contains duplicates.");
        } else {
            System.out.println("The array does not contain duplicates.");
        }
    }
}
*/

//METHOD NO.2
//Arrays.sort(x);
//used to sort array x with help from package import java.util.Arrays;
import java.util.Arrays;
public class Duplicate {
    public boolean hasDuplicate(int[] nums){
        if(nums==null || nums.length==0){
            return false;
        }
        Arrays.sort(nums);

        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                return true;
            }
        }
            return false;     
    }

    public static void main(String[] args) {
        Duplicate duplicateChecker = new Duplicate();
        int[] nums={1,2,4,6,9,5,3,4};


        if(duplicateChecker.hasDuplicate(nums)){
            System.out.println("has Duplicate");
        }else{
            System.out.println("NO Duplicate");
        }
    }
}

//error occoured:-  index out of bound
//line no.41  int i=1 earlier it was i=0
//because of our access to nums[i-1] at i=0 
//it is occuring error so start from i=1
