public class Diff{
// Show the Difference Between String and StringBuilder
public static void main(String[] args) {
    
         String s = "Hello";
    s += " World!";
    System.out.println("String: " + s); 


    StringBuilder sb = new StringBuilder("Hello");
    sb.append(" World!");
    System.out.println("StringBuilder: " + sb); 
}
}
