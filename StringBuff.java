public class StringBuff{
// Create a String Builder add String Vaalue is "Hello World" 
  // Print Hello using SubString()
  // Add ,  between Hello and World uisng Insert()
  // Delete World using delete();
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("Hello World");

   
    System.out.println(sb.substring(0, 5));

    // Adding , between "Hello" and "World" using insert()
    sb.insert(5, ",");
    System.out.println(sb);

    // Delete "World" using delete()
    sb.delete(6, sb.length());
    System.out.println(sb);
}
}
