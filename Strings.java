public class Strings{
// Prepare  a Reverse Function With Return Type String and Call IT in Main Method
 public static String reverseString(String name){
    StringBuilder sb = new StringBuilder(name);
    sb.reverse();
    return sb.toString(); 
}

public static void main(String[] args) {

    String naam = "PSVAI";
    
    String rev = reverseString(naam);
    System.out.println(rev);

  
}
}