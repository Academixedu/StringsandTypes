public class Strings{
// Prepare  a Reverse Function With Return Type String and Call IT in Main Method
public static String reverse(String name){
    StringBuilder sb = new StringBuilder(name);
    return sb.reverse().toString();
}
public static void main(String[] args) {
    String reversed = reverse("Nirmal");
    System.out.println(reversed);
}
}

