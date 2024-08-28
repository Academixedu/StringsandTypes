public class Strings{
// Prepare  a Reverse Function With Return Type String and Call IT in Main Method
public static void main(String[] args) {

String s = "Kashifa Kibria";
System.out.println(reverse(s));
}

public static String reverse(String s) {
    for(int i =s.length()-1;i>=0;i--){
        System.out.print(s.charAt(i));
    }
    return " ";
}}
