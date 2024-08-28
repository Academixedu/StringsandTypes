public class Diff{
// Show the Difference Between String and StringBuilder
public static void main(String[] args) {
    String str = "Hello";
    System.out.println("Original String: " + str);

    str += " World";
    System.out.println("Modified String: " + str);

    StringBuilder sb = new StringBuilder("Hello");
    System.out.println("Original StringBuilder: " + sb);

    sb.append(" World");
    System.out.println("Modified StringBuilder: " + sb);
    }
}
