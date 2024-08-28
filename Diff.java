public class Diff{
// Show the  String and StringBuilder 

    public static void main(String[] args) {

        String s = "Hello";
        String s1= "world";
        String s2= s.concat(s1);
        System.out.println(s2);
        System.out.println(s.substring(0,5));


        StringBuilder sb = new StringBuilder("Hello");
        sb.append("world");
        System.out.println(sb);
        StringBuffer sb1 = new StringBuffer("Hello world ");
        System.out.println(sb1.insert(6,","));
        System.out.println(sb1.insert(0, sb));

        


    }   
}
