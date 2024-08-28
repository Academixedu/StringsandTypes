public class Diff{
// Show the Difference Between String and StringBuilder

        public static void main(String[] args) {

            String str1 ="Hello";
            String str2 = "World";

            String s = str1.concat(str2);

            System.out.println(s);

            StringBuilder sb = new StringBuilder("Hello");
            sb.append("World");

            System.out.println(sb);
        }
  }
