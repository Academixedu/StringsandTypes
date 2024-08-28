public class StringBuff
{
// Create a String Builder add String Vaalue is "Hello World" 
  // Print Hello using SubString()
  // Add ,  between Hello and World uisng Insert()
  // Delete World using delete();
  public void StringBuilder()
  {

    StringBuilder sb=new StringBuilder("Shreyash Arghode");
    
    String hello=sb.substring(0,8);
    System.out.println(hello);

    sb.insert(9, ",");
    System.out.println("Comma Inserted => "+sb);
    
    sb.delete(9, 17);
    System.out.println("Deleted String => "+sb);

  }
  public static void main(String[] args) 
  {
     StringBuff aobj=new StringBuff();
     aobj.StringBuilder();  
  }

}
