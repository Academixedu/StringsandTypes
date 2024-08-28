public class Diff{
    // Show the Difference Between String and StringBuilder
    
       public static void main(String[] args) {
            String str = "Hello world";
             System.out.println(str);
            StringBuilder sb = new StringBuilder("Hello ");
            sb.append(" world");
            System.out.println(sb);
            sb.insert(6, ",");
            System.out.println(sb);
            sb.insert(0, sb);
           System.out.println(sb);
        }
    }
