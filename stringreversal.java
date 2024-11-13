/* string reversal can be done by two methods 
 * 1. by using // StringBuilder method or
 * 2.  without using // StringBuilder method
 * 
 * 1. by using // StringBuilder method
    public class stringreversal {
    public static void main(String[] args) {
        String string = "hello world";
        String reversedString = new StringBuilder(string).reverse().toString();
        System.out.println(reversedString);
    }
}

 * 2.  without using // StringBuilder method
 *     public class stringreversal {
    public static void main(String[] args) {
        String text = " hello world \n i am shaan";
        String reversed = "" ;
           for(int i = text.length()-1; i >= 0; i--){
             reversed += text.charAt(i);
            }
           System.out.println(reversed);
    }
}

 * 
 * 3.  long method
 *  public class StringReversal {
    public static String reverseString(String str) {
        // Convert string to character array
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        
        // Swap characters from start and end until middle
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        
        // Convert back to string and return
        return new String(charArray);
    }
    
    // Alternative method using StringBuilder
    public static String reverseStringBuilder(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    
    public static void main(String[] args) {
        String text = "Hello World";
        System.out.println("Original string: " + text);
        System.out.println("Reversed string (first method): " + reverseString(text));
        System.out.println("Reversed string (StringBuilder): " + reverseStringBuilder(text));
    }
}
 */

public class stringreversal {
    public static void main(String[] args) {
        
    }
}
