public class StringBuff{
// Create a String Builder add String Vaalue is "Hello World" 
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("Hello World");
    // Print Hello using SubString()
    String hello = sb.substring(0, 5); 
    System.out.println("Extracted: " + hello);
    // Add ,  between Hello and World uisng Insert()
    sb.insert(5, ","); 
    System.out.println("After insertion: " + sb);
    // Delete World using delete();
    sb.delete(6, sb.length()); 
    System.out.println("After deletion: " + sb);
  }
}


