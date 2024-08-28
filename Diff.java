public class Diff{
    public static void main(String[] args) {
        String s="Noyal preetham";
        StringBuilder sr=new StringBuilder(s);
        System.out.println(sr.insert(6,","));
        System.out.println("string builder is mutable");
        System.out.println("string is immutable and when we insert a value it shows error");
    }
// Show the Difference Between String and StringBuilder
}
