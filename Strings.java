public class Strings{
// Prepare  a Reverse Function With Return Type String and Call IT in Main Method
public String reverse(String s){
    StringBuilder a=new StringBuilder(s);
    a.reverse();
    return a.toString();
    
    }
    public static void main(String args[]){
        Strings obj=new Strings();
        String reversed=obj.reverse("sri");
        System.out.println(reversed);
    
    
    
    }
}
