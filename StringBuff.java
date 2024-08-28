public class StringBuff{
// Create a String Builder add String Vaalue is "Hello World" 
  // Print Hello using SubString()
  // Add ,  between Hello and World uisng Insert()
  // Delete World using delete();
  public static void main(String[] args) {
    String s="Hello World";
    StringBuilder sb=new StringBuilder(s);
    System.out.println(sb.substring(0,5));
    System.out.println(sb.insert(6, "-"));
    System.out.println(sb.delete(0, 7));
  }
}
