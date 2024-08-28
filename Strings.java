public class Strings{
// Prepare  a Reverse Function With Return Type String and Call IT in Main Method
public String Reverse(String s){
    StringBuilder b=new StringBuilder(s);
    b.reverse();
     return b.toString();
}
public static void main(String[] args) {
    Strings r=new Strings();
    System.out.println(r.Reverse("wos"));
}
}
