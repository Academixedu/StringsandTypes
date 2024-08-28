public class StringBuff{
// Create a String Builder add String Vaalue is "Hello World" 
  // Print Hello using SubString()
  // Add ,  between Hello and World uisng Insert()
  // Delete World using delete();
  public static void main(String args[]){
    String value="Hello World";
    StringBuilder s=new StringBuilder(value);
    System.out.println(s.substring(0,5));
    System.out.println(s.insert(5, ','));
    System.out.println(s.delete(6, 12));


  }
}
