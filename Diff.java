public class Diff{
// Show the Difference Between String and StringBuilder
    public static void main(String[] args) {
        //  String
        String str = "Hello";
        str = str + " World";
        System.out.println("String: " + str);

        //  StringBuilder
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println("StringBuilder: " + sb.toString());
    }
}


