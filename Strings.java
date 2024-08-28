import java.util.Scanner;

public class Strings
{
    // Prepare  a Reverse Function With Return Type String and Call IT in Main Method

    public void reverese()
    {
        Scanner in =new Scanner(System.in);
        System.out.println("------------------");
        System.out.println("Enter Your Reverse Word => ");
        String Reverse=in.nextLine();
        StringBuilder sb=new StringBuilder(Reverse);
        sb.reverse();
        System.out.println("Reverse String => "+sb);
    }
    public static void main (String[] args)
    {
        Strings aobj= new Strings();
        aobj.reverese();
    }
}
