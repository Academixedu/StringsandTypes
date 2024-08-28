public class Diff{
// Show the Difference Between String and StringBuilder
public static void main(String[]args){
    String name = "fayaz";
    System.out.println("name is " +name);
    name= name+"shaik";
    System.out.println("full name is " +name);


    StringBuilder na = new StringBuilder("fayaz");
    System.out.println("before String builder "+na);
    na.append("shaik");
    System.out.println("after String builder "+na);

}
}
