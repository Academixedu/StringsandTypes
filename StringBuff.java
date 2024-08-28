public class StringBuff{
 // Print Hello using SubString()
  // Add ,  between Hello and World uisng Insert()
  // Delete World using delete();

  public static void main(String[] args) {

    StringBuilder sb = new StringBuilder("Hello World");
    System.out.println(sb);
    System.out.println(sb.substring(0, 5));
    sb.insert(5, ",");
    System.out.println(sb);
    sb.delete(5, 9);
    System.out.println(sb);



  }
}