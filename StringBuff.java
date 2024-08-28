public class StringBuff{
// Create a String Builder add String Vaalue is "Hello World" 
  // Print Hello using SubString()
  // Add ,  between Hello and World uisng Insert()
  // Delete World using delete();
 public static void main(String[] args) {
  StringBuilder sb = new StringBuilder("Hello World");
  String sub = sb.substring(0, 5);
  System.out.println(sub);
  sb.insert(5, ",");
  System.out.println(sb.toString());
  sb.delete(5, 12);
  System.out.println(sb.toString());

 }
}
