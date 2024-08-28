public class Diff{
// Show the Difference Between String and StringBuilder
public static void main(String[]args){
    String name = "Nayeem";
    System.out.println("name is " +name);
    name= name+"Maseed";
    System.out.println("full name is " +name);


    StringBuilder na = new StringBuilder("Nayeem");
    System.out.println("before String builder "+na);
    na.append("Maseed");
    System.out.println("after String builder "+na);

}
}
