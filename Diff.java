public class Diff{
// Show the Difference Between String and StringBuilder
public static void main(String[] args) {
    String dif= "Helloo";
    System.out.println("Original Text: " + dif);
    dif = dif + " World";
        System.out.println("After: " + dif);
        dif = dif.replace("World", " Java");
        System.out.println("After replacement: " + dif);
        StringBuilder stbu = new StringBuilder("STR");
        System.out.println("Original SB: " + stbu);
        stbu.append(" Dif");
        System.out.println("After append: " + stbu);



}

}

