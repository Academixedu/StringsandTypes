public class StringBuff{
public static void main(String[] args) {
    
// Create a String Builder add String Vaalue is "Hello World" 
StringBuilder sb=new StringBuilder("Hello Wrold");
System.out.println(sb);
  
// Print Hello using SubString()
  System.out.println(sb.substring(0,5));
  
  // Add ,  between Hello and World uisng Insert()
  sb.insert(5, ",");
  System.out.println(sb);
  
  // Delete World using delete();
  System.out.println(sb.delete(6,12));
}
}
