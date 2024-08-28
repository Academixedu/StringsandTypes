public class Strings{
// Prepare  a Reverse Function With Return Type String and Call IT in Main Method
public static String reverseString(String name){
    StringBuilder na = new StringBuilder(name);
    return na.reverse().toString();
}
public static void main(String[] args) {
    String value = "Nayeem";
    String name = reverseString(value);
    System.out.println(name);
}
}
