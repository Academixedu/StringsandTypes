public class Diff{
// Show the Difference Between String and StringBuilder
public static void main(String[] args) {
    String s="Swarupa";
    s=s+" Jangam";
    System.out.println("The string is: "+s);
    StringBuilder s1=new StringBuilder("Jangam");
    s1.append(" Swarupa");
    System.out.println("The StringBuilder is: "+s1);
}
}
