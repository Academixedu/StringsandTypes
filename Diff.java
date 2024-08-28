public class Diff{
// Show the Difference Between String and StringBuilder
public static void main(String args[]){
    String s="Hello world";
    StringBuilder a=new StringBuilder(s);
    System.out.println("String is immutable it throws an error when we try to insert");
   // System.out.println(s.insert(5,','));//
   System.out.println("String Builder is mutable");
   System.out.println(a.insert(5,','));
}
}
