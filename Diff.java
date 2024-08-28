public class Diff{
    public static void main(String[] args) {

        String str = "Hello";
        String str2="Java";
        String str3=str2.concat(str);
        System.out.println(str3);

        StringBuilder sb = new StringBuilder("Hello");
        sb.append("Java");
        System.out.println(sb);
        
    }
// Show the Difference Between String and StringBuilder
}
