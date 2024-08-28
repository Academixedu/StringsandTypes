public class Strings{
// Prepare  a Reverse Function With Return Type String and Call IT in Main Method
public String Reverse(String str){
    StringBuilder sb = new StringBuilder(str);
    return sb.reverse().toString();
}
public static void main(String[] args) {
    Strings s = new Strings();
    String rs=s.Reverse("Hello");
    System.out.println("Reversed String: "+rs);
}
}
