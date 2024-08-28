public class Strings{
// Prepare  a Reverse Function With Return Type String and Call IT in Main Method
    public static String reverseString(String input) {
        StringBuilder sb = new StringBuilder(input);
        sb.reverse(); 
        return sb.toString(); 
    }
    public static void main(String[] args) {
        System.out.println(reverseString("Hello World")); 
    }
}



