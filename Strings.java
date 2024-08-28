public class Strings{
// Prepare  a Reverse Function With Return Type String and Call IT in Main Method
public static String reverse(String str) {
    StringBuilder sb = new StringBuilder(str);
    return sb.reverse().toString();
}
public static void main(String[] args) {
    String s = "Hello World";
    System.out.println("Original String: " + s);
    System.out.println("Reversed String: " + reverse(s));
}
}
