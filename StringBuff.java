public class StringBuff{
public static void main(String[] args) {
  // Create a String Builder add String Vaalue is "Hello World" 
  StringBuilder stb = new StringBuilder("Hello World");
  // Print Hello using SubString()
  System.out.println(stb.substring(0, 5));
// Add ,  between Hello and World uisng Insert()
stb.insert(5, ",");
System.out.println(stb);
// Delete World using delete();
stb.delete(05, 12);
System.out.println(stb);
}
}
