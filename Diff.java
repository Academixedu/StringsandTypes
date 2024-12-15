 public class Diff{
    // Show the Difference Between String and StringBuilder
    public static void main(String[]args){
        String name = "Bharath";
        System.out.println("name is " +name);
        name= name+"Manne";
        System.out.println("full name is " +name);
    
    
        StringBuilder na = new StringBuilder("Bharath");
        System.out.println("before String builder "+na);
        na.append("Manne");
        System.out.println("after String builder "+na);
    
    }
    }
