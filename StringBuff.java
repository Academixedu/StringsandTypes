public class StringBuff{
// Create a String Builder add String Vaalue is "Hello World" 
  // Print Hello using SubString()
  // Add ,  between Hello and World uisng Insert()
  // Delete World using delete();

  public static void main(String[] args) {
    StringBuffer sb = new StringBuffer("Hello World");
    System.out.println(sb.substring(0, 5));
    sb.insert(5, ",");
    System.out.println(sb);
    sb.delete(6, 12);
    System.out.println(sb);
  }
}
