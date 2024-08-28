public class Diff{
    // Show the Difference Between String and StringBuilder
    public static void main(String[] args) {
        String s = "Hello";
        StringBuilder strram = new StringBuilder("Hello");
        System.out.println(s);
        System.out.println(strram);
    
        s = s + " World";
        strram.append(" World");
        System.out.println(s);
        System.out.println(strram);
    }
    }