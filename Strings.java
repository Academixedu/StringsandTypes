public class Strings{
// Prepare  a Reverse Function With Return Type String and Call IT in Main Method
public static String reverseString(String name){
    StringBuilder sb=new StringBuilder(name);
    return sb.reverse().toString();
}
public static void main(String[] args) {
    String s="saikumar";
    String name=reverseString(s);
    System.out.println(name);

}
}
