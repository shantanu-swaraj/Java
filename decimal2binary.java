// coverting decimal numbers to binary format

public class decimal2binary {
    public static void main(String[] args) {
        int decimal = 69;
        String binary = Integer.toBinaryString(decimal);
        System.out.println(binary);

    }
}

/* using //recursion
 * public class DecimalToBinary {
    public static void main(String[] args) {
        int decimal = 10;
        System.out.println(toBinary(decimal)); // Output: 1010
    }

    public static String toBinary(int n) {
        if (n == 0) {
            return "";
        }
        return toBinary(n / 2) + (n % 2);
    }
}

 */
