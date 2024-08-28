public class Diff{
    // Show the Difference Between String and StringBuilder
    public static void main(String[] args) {
    
        String str = "Hello";
        System.out.println("Original String: " + str);
    
        str = str + " World";
        System.out.println("String after concatenation: " + str);
    
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Original StringBuilder: " + sb);
    
    
        sb.append(" World");
        System.out.println("StringBuilder after append: " + sb);
    
        long startTime, endTime;
    
        startTime = System.currentTimeMillis();
        String inefficientStr = "";
        for (int i = 0; i < 10000; i++) {
            inefficientStr += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken for String concatenation: " + (endTime - startTime) + " ms");
        startTime = System.currentTimeMillis();
        StringBuilder efficientSb = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            efficientSb.append(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken for StringBuilder append: " + (endTime - startTime) + " ms");
    }
    
    }
