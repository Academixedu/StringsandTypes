public class Strings{
// Prepare  a Reverse Function With Return Type String and Call IT in Main Method
public static String reverse(String input) {
    return new StringBuilder(input).reverse().toString();
}

public static void main(String[] args) {
    String main = "Hello World";
    String reversed = reverse(main);
    System.out.println(reversed); 
}
}
