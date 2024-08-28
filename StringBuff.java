public class StringBuff{
  public static void main(String[] args) {
    String s="Hello World";
    StringBuilder sb=new StringBuilder(s);
    
    System.out.println(sb.substring(0,5));
    System.out.println(sb.insert(5,","));
    System.out.println(sb.delete(6, 12));
  }
// Create a String Builder add String Vaalue is "Hello World" 
  // Print Hello using SubString()
  // Add ,  between Hello and World uisng Insert()
  // Delete World using delete();
}
