public class Diff{
// Show the Difference Between String and StringBuilder

    public static void main(String[] args) {

        String s = "Kashifa";
        String s1="Kibria";
        String s2=s.concat(s1);
        System.out.println(s2);
        System.out.println(s.substring(0,7));

        StringBuilder sb = new StringBuilder("Kashifa");
        sb.append("Kibria");
        System.out.println(sb);

        StringBuilder sb1 = new StringBuilder("Kashifa Kibria");

        System.out.println(sb1.insert(7,","));
       // System.out.println(sb1.insert(0,sb));

    }
}
