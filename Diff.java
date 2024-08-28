public class Diff{
// Show the Difference Between String and StringBuilder
public static void main(String[] args) {
    String s="SAIKUMAR";
    System.out.println("does not add values directly: "+s);


    StringBuilder sb=new StringBuilder("saikumar");
    
    sb.insert(3,"-");
    System.out.println("add values directly: "+sb);
}
}
