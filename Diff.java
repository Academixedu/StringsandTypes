public class Diff{
// Show the Difference Between String and StringBuilder
public static void main(String[] args) {
    String s = "Hello";
    StringBuilder strbui = new StringBuilder("Hello");
    System.out.println(s);
    System.out.println(strbui);

    s = s + " World";
    strbui.append(" World");
    System.out.println(s);
    System.out.println(strbui);
}
}
