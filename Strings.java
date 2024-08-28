public class Strings{
    // Prepare  a Reverse Function With Return Type String and Call IT in Main Method
    
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str);
        System.out.println(reverse(str));
    }
    public static String reverse(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        return "";
    }
    }