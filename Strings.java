public class Strings{
    public String reverse(String s){
        StringBuilder sr=new StringBuilder(s);
        sr.reverse();
        return sr.toString();
    }
    public static void main(String[] args) {
        Strings a=new Strings();
        String reversed=a.reverse("ayoN");
        System.out.println(reversed);
    }
// Prepare  a Reverse Function With Return Type String and Call IT in Main Method
}
