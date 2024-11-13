//chck if given number is even or odd
/* 
public class evenorodd {
    public static void main(String[] args) {
        int num = 4;
        if (num%2 == 0){
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number.");
        }
    }
}*/

/*
 * //using Scanner class
 */ 
 import java.util.*;
 public class evenorodd {
 public static void main(String[] args) {
int num;
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter a number:");
 num = sc.nextInt();

 if (num%2 == 0){
 System.out.println(num + " is an even number.");
 } else {
 System.out.println(num + " is an odd number.");
 }
}}
 