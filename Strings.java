public class Strings{
    // Prepare  a Reverse Function With Return Type String and Call IT in Main Method
    public static String reverse(String str){
        String reverse = "";
        for(int i = str.length() - 1; i >= 0; i--){
            reverse = reverse + str.charAt(i);
        }
        return reverse;
    }
    }