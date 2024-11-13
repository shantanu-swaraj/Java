public class palindrome {
    public static void main(String[] args) {
        int num = 121;
        int reversednum = 0, temp = num;
        while(temp!=0){
            int digit = temp%10;
            reversednum = reversednum*10 + digit;
            temp = temp/10;
        }
        if(num==reversednum){
            System.out.println("The number is a palindrome.");
        } else {
            System.err.println("this is not a palindrome");
    }
}
}
