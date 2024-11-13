public class reversenumber {
    public static void main(String[] args) {
        int num = 1235678;
        int reversednum = 0;
        while ( num!=0) {
            int digit = num%10;
            reversednum = reversednum*10+digit;
            num /= 10;
        }
        System.err.println(reversednum);

    }
}
