public class StringBuff{
// Create a String Builder add String Vaalue is "Hello World" 
  // Print Hello using SubString()
  // Add ,  between Hello and World uisng Insert()
  // Delete World using delete();
  public class StringBuff {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Hello World");
        String s=sb.substring(0, 5);
        System.out.println(s);
        sb.insert(5, ",");
        sb.delete(7, 12);
        System.out.println(sb);
    }
}

}
