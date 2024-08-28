public class Strings{
// Prepare  a Reverse Function With Return Type String and Call IT in Main Method
public String reverse(String s){
    StringBuilder sr=new StringBuilder(s);
    sr.reverse();
    return sr.toString();
}
public static void main(String[] args) {
    Strings a=new Strings();
    String reversed=a.reverse("pavs");
    System.out.println(reversed);
}
}
