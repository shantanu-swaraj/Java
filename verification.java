/* 
 * verification of character is it is an Alphaber, number, or special character 
 * 
 */

public class verification {
    public static void main(String[] args) {
        char ch = '1';

        if (Character.isAlphabetic(ch)) {
            System.out.println("Alphabet");
        } else if (Character.isDigit(ch)) {
            System.out.println("Number");
        } else {
            System.out.println("Special Character");
        }

    }
    
}

// if given a string // then take us e the first letter or character
/*
  public class Verification {
    public static void main(String[] args) {
        String str = "a";

        // Check if the string has exactly one character
        if (str.length() == 1) {
            char ch = str.charAt(0); // Get the first character

            if (Character.isLetter(ch)) {
                System.out.println("Character is an Alphabet");
            } else if (Character.isDigit(ch)) {
                System.out.println("Character is a Number");
            } else {
                System.out.println("Character is a Special Character");
            }
        } else {
            System.out.println("Please provide a single character.");
        }
    }
}

 */
