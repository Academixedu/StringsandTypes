public class Diff{
// Show the Difference Between String and StringBuilder
  public static void main(String[] args) {
     String name = "PSVSAI";
     name = name + " MAHESH";
     System.out.println("String name is : " + name);

     StringBuilder sb = new StringBuilder("PSVSAI");
     sb.append(" MAHESH");
     System.out.println("Stringbuilder : " + sb.toString());
  }
}
