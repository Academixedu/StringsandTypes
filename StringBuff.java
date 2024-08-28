public class StringBuff{
  public static void main(String[] args) {
    
    StringBuffer sb = new StringBuffer("Hello world");
    System.out.println(sb);
    String sb2 = sb.substring(0,5);
    System.out.println(sb2);
    sb.insert(6, ",");
    System.out.println(sb);
    sb.delete(6, 12);
    System.out.println(sb);
  }
// Create a String Builder add String Vaalue is "Hello World" 
  // Print Hello using SubString()
  // Add ,  between Hello and World uisng Insert()
  // Delete World using delete();
}
