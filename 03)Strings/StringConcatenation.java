import java.util.ArrayList;

public class StringConcatenation {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println('a'+3);
        System.out.println("a"+1);
        System.out.println("Kunal"+new ArrayList<>());
        String ans = 56 + "" +new ArrayList<>();
        System.out.println(ans);
    }
}
