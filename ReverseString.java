/*
* The beginner recursion program.
*
* @author  Devin Jhu
* @version 1.0
* @since   2022-11-04
*/

/**
 * This reverses strings.
*/
final class ReverseString {

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private ReverseString() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * This function reverses a string.
     *
     * @param inputString string to be base reversal on.
     * @return reverse of the input string.
     */
    public static String reverse(final String inputString) {
        final String reversedString;
        if (inputString.length() == 0) {
            reversedString = "";
        } else {
            reversedString = 
                reverse(inputString.substring(1)) + (inputString.charAt(0));
        }
        return reversedString;
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        final String reversedString = "reversed";
        System.out.println("original: " + reversedString);
        System.out.println("reversed: " + reverse(reversedString));
        System.out.println("\nDone.");
    }
}
