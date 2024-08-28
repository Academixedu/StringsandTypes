public class Diff{
// Show the Difference Between String and StringBuilder
public static void main(String[] args) {
    StringBuilder sb=new StringBuilder("Iam Pratap from bangalore");
    String s="Iam Pratap from bangalore";
    for(int i=0;i<=3;i++){
        sb.append("!");
        s+="!";
    }
    System.out.println(sb);
    System.out.println(s);
}
}
