//package Leetcode234;
/*
import java.util.List;

public class Palindrome {
    public boolean isPalindrome(ListNode head){
        ListNode slow=head;
        ListNode fast= head;

        while(fast != null && fast.next != null){
            fast=fast.next.next;
            slow=slow.next;

        }
        slow=reversed(slow);
        fast=head;

        while(slow!=null){
            if(slow.val!=fast.val){
                return false;
            }
            slow=slow.next;
            fast=fast.next;
        }
        return true;
    }

    public ListNode reversed(ListNode head){

    
    ListNode prev=null;
    while(head!=null){
        ListNode next=head.next;
        head.next=prev;
        prev=head;
        head=next;
    
    }
    return prev;
}
}

//errors
//need ListNode class
//reversed method syntax
*/

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Palindrome {
    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        slow = reversed(slow);
        fast = head;

        while (slow != null) {
            if (slow.val != fast.val) {
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }

    public ListNode reversed(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        Palindrome palindromeChecker = new Palindrome();

        // Creating a linked list: 
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(5);
        ListNode node3 = new ListNode(5);
        ListNode node4 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        // Checking if the linked list is a palindrome
        boolean result = palindromeChecker.isPalindrome(node1);
        System.out.println("Is palindrome: " + result);
    }
}

