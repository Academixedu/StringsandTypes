public class StringBuff{
// Create a String Builder add String Vaalue is "Hello World" 
  // Print Hello using SubString()
  // Add ,  between Hello and World uisng Insert()
  // Delete World using delete();
  public static void main(String[] args) {
  StringBuilder sb = new StringBuilder("Hello World");

  String str=sb.substring(0,5);
  System.out.println("StringBuilder: "+str);

  sb.insert(5,",");
  System.out.println("After Insertion: "+sb);

  sb.delete(6, 12);
  System.out.println("After Deletion: "+sb);
  }
}
