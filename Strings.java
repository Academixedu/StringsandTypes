public class Strings{
// Prepare  a Reverse Function With Return Type String and Call IT in Main Method
 public static String reverse(){
    String str="SWARUPA JANGAM";
    return new StringBuilder(str).reverse().toString();
 }
 public static void main(String[] args) {
    String s= reverse();
    System.out.println(s);

 }
}
