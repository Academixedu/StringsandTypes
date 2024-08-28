public class Diff{
// Show the Difference Between String and StringBuilder
    public static void main(String[] args) {
        String str = "Hello";
        str += " welcome to my lab";
        System.out.println("String result: " + str);

        StringBuilder sb = new StringBuilder("kavitha");
        sb.append(" , sujatha");
        System.out.println("StringBuilder result: " + sb);
    }
}


