public class Strings{
// Prepare  a Reverse Function With Return Type String and Call IT in Main Method
    public static String reverseString(String input) {
        String[] characters = input.split("");
    
        String reversed = "";
        
        
        for (int i = characters.length - 1; i >= 0; i--) {
            reversed += characters[i]; 
        }
        return reversed;
    }

    public static void main(String[] args) {
        String originalString = "Hello siri!";
        
        String reversedString = reverseString(originalString);
        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversedString);
    }
}

