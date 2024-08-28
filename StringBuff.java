public class StringBuff{
// Create a String Builder add String Vaalue is "Hello World" 
  // Print Hello using SubString()
  // Add ,  between Hello and World uisng Insert()
  // Delete World using delete();
  public static void main(String[] args) {
    String s= "Hello World";
    StringBuilder b=new StringBuilder(s);
    System.out.println(b.substring(0,5));
    System.out.println(b.insert(5, ","));
    System.out.println(b.delete(6, 12));
  }
}
