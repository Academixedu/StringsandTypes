public class StringBuff{
// Create a String Builder add String Vaalue is "Hello World" 
  // Print Hello using SubString()
  // Add ,  between Hello and World uisng Insert()
  // Delete World using delete();
public static void main(String[]args){
    StringBuilder val = new StringBuilder("hello world");
    String na = val.substring(0,5);
    System.out.println(na);
    val.insert(5,",");
    System.out.println("after , added  value is: "+val);
    val.delete(7, 12);
    System.out.println("after deleting value is: "+val);


  }
}
