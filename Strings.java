public class Strings{
// Prepare  a Reverse Function With Return Type String and Call IT in Main Method
    public static String reverse(String input) {
        StringBuilder a = new StringBuilder(input);
        return a.reverse().toString();
    }

    public static void main(String[] args) {
        String b = "Hello World";
        String c = reverse(b);
        System.out.println(c);
    }
}

}
