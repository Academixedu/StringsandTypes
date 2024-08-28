// String vs. StringBuilder:

// String: Immutable class. Once a String object is created, its value cannot be changed. Any modification creates a new String object.

// StringBuilder: Mutable class. It allows for modifications to the string without creating new objects each time. This makes StringBuilder more efficient when performing many modifications.
public class Diff
{
// Show the Difference Between String and StringBuilder
public void Difference()
{
  String abc="Shreyash";
  String abc1=abc;
  abc1=abc+" -Arghode";
  System.out.println(abc1);
  System.out.println(abc);
  
  StringBuilder sb=new StringBuilder();
  sb.append(" Avinash");
  sb.insert(8, " Avinashhh");
  System.out.println(sb);

}
public static void main(String[] args) 
{
   Diff aobj =new Diff();
   aobj.Difference();    
}

}
