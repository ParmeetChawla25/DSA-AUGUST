import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListP {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list= new ArrayList<>(5);
        for (int i=0;i<7;i++){
            list.add(in.nextInt());
        }
        System.out.println(list);
        System.out.println(list.contains(99));
    }
}
