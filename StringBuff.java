public class StringBuff{
// Create a String Builder add String Vaalue is "Hello World" 
  // Print Hello using SubString()
  // Add ,  between Hello and World uisng Insert()
  // Delete World using delete();
  public static void main(String[] args) {
    
    StringBuilder sb = new StringBuilder("Hello World");
    
   
    String hello = sb.substring(0, 5);
    System.out.println("Substring 'Hello': " + hello);
    
    
    sb.insert(5, ",");
    System.out.println("After inserting comma: " + sb);
    
   
    sb.delete(7, sb.length());
    System.out.println("After deleting 'World': " + sb);
}
}
